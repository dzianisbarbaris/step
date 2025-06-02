----- создание схемы -----
CREATE SCHEMA IF NOT EXISTS event_booking_system;

----- пользователи -----
Пользователи (Users):
ID пользователя (уникальный идентификатор).
Имя (строка, обязательно).
Email (уникальный, строка).
Дата регистрации (дата и время).

CREATE TABLE users (
user_id SERIAL PRIMARY KEY,
user_name VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE,
booking_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

----- Места проведения ------
Места проведения (Venues):
ID места (уникальный идентификатор).
Название места (строка, обязательно).
Адрес (строка, обязательно).
Вместимость (целое число, больше 0).

CREATE TABLE venues (
venue_id SERIAL PRIMARY KEY,
venue_name VARCHAR(50) NOT NULL,
address VARCHAR(100) NOT NULL,
capacity INTEGER,
CONSTRAINT check_capacity
CHECK (capacity > 0)
);



----- Мероприятия -----
Мероприятия (Events):
ID мероприятия (уникальный идентификатор).
Название мероприятия (строка, обязательно).
Дата и время проведения (дата и время, обязательно).
ID места проведения (связь с таблицей Venues).
Общее количество мест (целое число, должно быть меньше или равно вместимости места).
Цена билета (десятичное число, больше или равно 0).

CREATE TABLE events (
event_id SERIAL PRIMARY KEY,
event_name VARCHAR(100) NOT NULL,
event_date TIMESTAMP NOT NULL,
venue_id INTEGER,
quantity_of_seats INTEGER,
ticket_price DECIMAL(5,2),
CONSTRAINT check_event_date
CHECK (event_date > CURRENT_TIMESTAMP),
CONSTRAINT check_quantity_of_seats
CHECK (quantity_of_seats <= venues(capacity)),
CONSTRAINT check_ticket_price
CHECK (ticket_price >= 0),
CONSTRAINT fk_venue_id
FOREIGN KEY (venue_id)
REFERENCES event_booking_system.venues(venue_id)
ON DELETE SET NULL
);



----- Бронирования -----
Бронирования (Bookings):
ID бронирования (уникальный идентификатор).
ID пользователя (связь с таблицей Users).
ID мероприятия (связь с таблицей Events).
Количество забронированных мест (целое число, больше 0).
Дата бронирования (дата и время, обязательно).
Статус бронирования (например, "confirmed", "canceled").

CREATE TYPE booking_status AS ENUM ('confirmed','canceled');
CREATE TABLE bookings (
booking_id SERIAL PRIMARY KEY,
user_id INTEGER,
event_id INTEGER,
booked_seats INTEGER,
booking date TIMESTAMP NOT NULL,
status booking_status NOT NULL DEFAULT 'confirmed',
CONSTRAINT fk_user_id
FOREIGN KEY (user_id)
REFERENCES event_booking_system.users(user_id)
ON DELETE SET NULL,
CONSTRAINT fk_event_id
FOREIGN KEY (event_id)
REFERENCES event_booking_system.events(event_id)
ON DELETE SET NULL,
CONSTRAINT check_booked_seats
CHECK (booked_seats > 0)
);

----Список всех мероприятий с указанием их названия, места проведения (название и адрес) даты проведения и оставшихся мест.----
SELECT e.event_name, v.venue_name, v.address, e.event_date, e.quantity_of_seats - SUM(b.booked_seats) AS available_seats
FROM events e INNER JOIN bookings b ON e.event_id = b.event_id
INNER JOIN venues v ON e.venue_id = v.venue_id
WHERE status = 'confirmed'
GROUP BY e.event_name, v.venue_name, v.address, e.event_date, e.quantity_of_seats;
