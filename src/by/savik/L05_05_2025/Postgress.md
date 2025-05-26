CREATE TABLE users (
id SERIAL PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
);


CREATE TABLE users (
id SERIAL PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL
);


CREATE TABLE products (
id SERIAL PRIMARY KEY,
title VARCHAR(100) UNIQUE NOT NULL,
price DECIMAL(10,2) NOT NULL
);


CREATE TABLE products (
id SERIAL PRIMARY KEY,
title VARCHAR(100) NOT NULL,
price DECIMAL(10,2) NOT NULL
);


ALTER TABLE "products"
DROP CONSTRAINT "products_title_key";


CREATE TABLE orders (
id SERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id),
total INTEGER,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE order_items (
id SERIAL PRIMARY KEY,
order_id INTEGER REFERENCES orders(id),
product_id INTEGER REFERENCES products(id),
quantity INTEGER NOT NULL
);


ALTER TABLE orders
ADD CONSTRAINT fk_user
FOREIGN KEY (user_id)
REFERRENCES users(id);




ALTER TABLE orders
ADD CONSTRAINT fk_user
FOREIGN KEY (user_id)
REFERENCES users(id);




ALTER TABLE "orders" DROP CONSTRAINT "orders_user_id_fkey";


ALTER TABLE users
ADD COLUMN phone VARCHAR(20);




ALTER TABLE users
ADD COLUMN age INTEGER;




ALTER TABLE users
RENAME COLUMN name to full_name;




ALTER TABLE users
DROP COLUMN age;




CREATE TABLE customers (
id SERIAL PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(100) UNIQUE,
birth_date DATE
);


CREATE TABLE purchases (
id SERIAL,
customer_id INTEGER REFERENCES customers(id),
item_name VARCHAR(100),
amount DECIMAL (10,2) NOT NULL
);


ALTER TABLE customers
ADD COLUMN phone VARCHAR(20),
DROP COLUMN birth_date,
RENAME COLUMN name to full_name;




ALTER TABLE customers
ADD COLUMN phone VARCHAR(20)
DROP COLUMN birth_date
RENAME COLUMN name to full_name;




ALTER TABLE customers
RENAME COLUMN name to full_name,
ADD COLUMN phone VARCHAR(20),
DROP COLUMN birth_date;



ALTER TABLE customers
RENAME COLUMN name to full_name
ADD COLUMN phone VARCHAR(20),
DROP COLUMN birth_date;



ALTER TABLE customers
RENAME COLUMN name to full_name
ADD COLUMN phone VARCHAR(20)
DROP COLUMN birth_date;



ALTER TABLE customers
ADD COLUMN phone VARCHAR(20);




ALTER TABLE customers
DROP COLUMN birth_date;




ALTER TABLE customers
RENAME COLUMN name to full_name;




CREATE TABLE payments(
payment_id SERIAL,
purchase_id INTEGER REFERENCES purchases(id),
method VARCHAR(100),
paid_at DATE
);




ALTER TABLE "purchases"
ADD CONSTRAINT "purchases_id" UNIQUE ("id");


CREATE TABLE payments(
payment_id SERIAL,
purchase_id INTEGER REFERENCES purchases(id),
method VARCHAR(100),
paid_at DATE
);




INSERT INTO users (full_name, email, phone)
VALUES ('Иван Петрович', 'vanya@gmail.com', '+375298427617');


INSERT INTO users (full_name, email, phone)
VALUES ('Денис Денисович', 'den@gmail.com', '+375333333333'),
VALUES ('Олег Дмитриевич', 'oleg@gmail.com', '+375292992929'),
VALUES ('Ольга Федоровна', 'volga@gmail.com', '+375553333333');


INSERT INTO users (full_name, email, phone)
VALUES ('Денис Денисович', 'den@gmail.com', '+375333333333'),
('Олег Дмитриевич', 'oleg@gmail.com', '+375292992929'),
('Ольга Федоровна', 'volga@gmail.com', '+375553333333');


INSERT INTO users
VALUES (DEFAULT, 'Александр Смирнов', 'sasha@gmail.com', '+375298422617'),
(DEFAULT, 'Юлия Сидорова', 'july@gmail.com', '+375295142479');


SELECT * FROM users;


SELECT full_name FROM users;


SELECT full_name, phone FROM users;


SELECT full_name, phone FROM users
WHERE phone = '+375298427617';


SELECT full_name, phone FROM users
WHERE phone = '+375298427617' and full_name = 'Иван Петрович';


SELECT full_name, phone FROM users
WHERE (phone = '+375298427617' and full_name = 'Иван Петрович') or email = 'olya@gmail.com';


SELECT full_name, phone FROM users
WHERE (phone = '+375298427617' and full_name = 'Иван Петрович') or email = 'july@gmail.com';


SELECT full_name, phone FROM users
ORDER BY full_name;




SELECT full_name, phone FROM users
WHERE phone IS NULL
ORDER BY full_name;




SELECT full_name, phone FROM users
WHERE phone IS NOT NULL
ORDER BY full_name;




ALTER TABLE users
ADD COLUMN age INTEGER;




SELECT * FROM users ;


INSERT INTO users (id, age)
VALUES (1, 44);


UPDATE "users" SET
"id" = '1',
"full_name" = 'Иван Петрович',
"email" = 'vanya@gmail.com',
"phone" = '+375298427617',
"age" = '44'
WHERE "id" = '1';


UPDATE "users" SET
"id" = '6',
"full_name" = 'Юлия Сидорова',
"email" = 'july@gmail.com',
"phone" = '+375295142479',
"age" = '26'
WHERE "id" = '6';


UPDATE "users" SET
"id" = '5',
"full_name" = 'Александр Смирнов',
"email" = 'sasha@gmail.com',
"phone" = '+375298422617',
"age" = '33'
WHERE "id" = '5';


UPDATE "users" SET
"id" = '4',
"full_name" = 'Ольга Федоровна',
"email" = 'volga@gmail.com',
"phone" = '+375553333333',
"age" = '30'
WHERE "id" = '4';


UPDATE "users" SET
"id" = '3',
"full_name" = 'Олег Дмитриевич',
"email" = 'oleg@gmail.com',
"phone" = '+375292992929',
"age" = '20'
WHERE "id" = '3';


UPDATE "users" SET
"id" = '2',
"full_name" = 'Денис Денисович',
"email" = 'den@gmail.com',
"phone" = '+375333333333',
"age" = '58'
WHERE "id" = '2';


SELECT * FROM users
WHERE age BETWEEN 30 AND 50;




SELECT * FROM users
WHERE age > 25;




SELECT COUNT(*) FROM users
WHERE age < 30;





SELECT COUNT(*) as age_less_than_30 FROM users
WHERE age < 30;





SELECT COUNT(*) as age_less_than_30 FROM users
WHERE age < 30;

SELECT AVG(age) as average_age FROM users; 





SELECT * FROM users as ФИО, email as Почта FROM users 


;


SELECT * FROM users as ФИО, email as Почта FROM users; 





SELECT full_name as ФИО, email as Почта FROM users; 





SELECT full_name as ФИО, email as Почта FROM users
WHERE full_name LIKE '%c%'; 





SELECT full_name as ФИО, email as Почта FROM users
WHERE full_name LIKE '%с%'; 





SELECT full_name as ФИО, email as Почта FROM users
WHERE full_name LIKE '%с%'
ORDER BY email DESC; 





SELECT full_name as ФИО, email as Почта FROM users
ORDER BY email DESC
LIMIT 2;





SELECT full_name as ФИО, email as Почта age as Возраст FROM users
WHERE age IN (33, 25);





SELECT full_name as ФИО, email as Почта, age as Возраст FROM users
WHERE age IN (33, 25);





SELECT full_name as ФИО, email as Почта, age as Возраст FROM users
WHERE age IN (33, 58);





CREATE TABLE students (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100),
  age INT,
  grade CHAR(1)
);





INSERT INTO students
VALUES (DEFAULT, 'Анна', 19, 'B');





INSERT INTO students
VALUES (DEFAULT, 'Иван', 19, 'B'),
(DEFAULT, 'Лена', 20, 'C');





INSERT INTO students (name, age)
VALUES ('Борис', 21);





INSERT INTO students
VALUES (DEFAULT, 'O''Connor', 18, 'B');




SELECT * FROM students ;


SELECT * FROM students name, grade;


SELECT FROM students name, grade;


SELECT name, grade FROM students;


SELECT * FROM students
WHERE age > 18;




SELECT * FROM students
WHERE grade LIKE 'A';




SELECT * FROM students
WHERE grade LIKE 'А';




SELECT * FROM students
WHERE grade = 'A';




SELECT * FROM students

;


UPDATE "students" SET
"id" = '1',
"name" = 'Анна',
"age" = '19',
"grade" = 'A'
WHERE "id" = '1';


SELECT * FROM students
WHERE grade = 'A';




SELECT * FROM students
ORDER BY name;




SELECT * FROM students
WHERE name LIKE 'А%';




SELECT * FROM students
WHERE age BETWEEN 18 AND 20;




SELECT * FROM students
WHERE grade IS NULL;




SELECT COUNT(*) as students_count FROM students

;


SELECT AVG(age) FROM students

;


CREATE TABLE students (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100),
  age INT,
  grade CHAR(1)
);





CREATE TABLE books (
id SERIAL,
title VARCHAR(100) NOT NULL,
author VARCHAR(100),
genreVARCHAR(50),
price NUMERIC(5,2),
pages INT,
year INT
);


CREATE TABLE books (
id SERIAL,
title VARCHAR(100) NOT NULL,
author VARCHAR(100),
genre VARCHAR(50),
price NUMERIC(5,2),
pages INT,
year INT
);


ALTER TABLE books
ADD COLUMN rating NUMERIC(2,1)

;


ALTER TABLE books
ALTER COLUMN title SET NOT NULL
;


ALTER TABLE books
RENAME COLUMN genre to category;


ALTER TABLE books
ADD CONSTRAINT title NOT NULL;


ALTER TABLE books
ALTER COLUMN price CHECK (price > 0)

;


ALTER TABLE books
ALTER COLUMN price NUMERIC CHECK (price > 0)

;


ALTER TABLE books
ALTER COLUMN price NUMERIC CHECK (price > 0);




ALTER TABLE books
ADD CONSTRAINT price CHECK (price > 0);




SELECT * FROM books 

;


SELECT * FROM books
WHERE price > 20

;


SELECT * FROM books
WHERE pages > 300

;


SELECT * FROM books
ORDER BY year DESC 

;


SELECT * FROM books
ORDER BY price
LIMIT 5;




SELECT b.* FROM books b1
WHERE b1.price = (
SELECT MAX(b2.price)
FROM books
WHERE b2.category = b1.category
)
;


SELECT category MAX(price) as max_price
FROM books
GROUP BY category;





SELECT b1.*, (SELECT AVG(price) FROM books b2 
WHERE b1.category = b2.category) as avg_category_price
FROM books b1;





INSERT INTO orders(user_id, total, created_at)
VALUES (1, 2000, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (2, 300, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (3, 400, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (4, 500, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (5, 600, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (6, 1500, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (3, 1200, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (3, 1700, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (1, 2200, NOW());


INSERT INTO orders(user_id, total, created_at)
VALUES (NULL, 3000, NOW());


DELETE FROM "orders"
WHERE (("id" = '5'));


SELECT u.full_name AS 'ФИО', o.created AS 'Время Заказа' FROM users u LEFT JOIN  orders o ON u.id = o_user_id;


SELECT u.full_name AS 'ФИО', o.created_at AS 'Время Заказа' FROM users u LEFT JOIN  orders o ON u.id = o_user_id;


SELECT u.full_name AS 'FULLNAME', o.created_at AS 'ORDERDATETIME' FROM users u LEFT JOIN  orders o ON u.id = o_user_id;


SELECT u.full_name AS FULLNAME, o.created_at AS ORDERDATETIME FROM users u LEFT JOIN  orders o ON u.id = o_user_id;


SELECT u.full_name AS FULLNAME, o.created_at AS ORDERDATETIME FROM users u LEFT JOIN  orders o ON u.id = o.user_id;


SELECT u.full_name AS FULLNAME, o.created_at AS ORDERDATETIME FROM users u RIGHT JOIN orders o ON u.id = o.user_id;


SELECT u.full_name AS FULLNAME, o.created_at AS ORDERDATETIME FROM users u INNER JOIN orders o ON u.id = o.user_id;


SELECT u.full_name AS FULLNAME, o.created_at AS ORDERDATETIME FROM users u FULL OUTER JOIN orders o ON u.id = o.user_id;


SELECT u.full_name AS FULLNAME, o.total as TOTAL, o.created_at AS ORDERDATETIME FROM users u INNER JOIN orders o ON u.id = o.user_id
WHERE o.total > 1000;


SELECT u.full_name AS FULLNAME, SUM(o.total) as TOTAL, FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name, SUM(o.total) FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS FULLNAME, SUM(o.total) as TOTAL FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS "FULLNAME", SUM(o.total) as "TOTAL" FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS "ФИО", SUM(o.total) as "СУММА ЗАКАЗОВ" FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS FULLNAME, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name
ORDER BY 2;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name HAVING SUM(o.total) > 1000;
ORDER BY 2;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name HAVING SUM(o.total) > 1000
ORDER BY 2;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name WHERE SUM(o.total) > 1000
ORDER BY 2;


SELECT u.full_name AS ФИО, SUM(o.total) as СУММА_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name HAVING COUNT(o.user_id) > 1
ORDER BY 2;


SELECT u.full_name AS ФИО, COUNT(o.user_id) as КОЛИЧЕСТВО_ЗАКАЗОВ FROM users u INNER JOIN orders o ON u.id = o.user_id
GROUP BY full_name HAVING COUNT(o.user_id) > 1
ORDER BY 2;



