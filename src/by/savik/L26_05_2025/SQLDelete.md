
-----DELETE-----
//удаление данных из таблицы
DELETE FROM table_name
WHERE condition
RETURNING column1, column2;

//удалить города с населением меньше 250к
DELETE FROM cities c WHERE population < 250000
RETURNING c.city_name, c.city_id



-----UPDATE-----
//обновление данных
UPDATE table_name
SET column1 = value1, column2 = value2
WHERE condition
RETURNING column1, column2

//обновим население москвы(увеличим на 1000000)
UPDATE cities
SET population = population + 1000000
WHERE city_name = 'Moscow'
RETURNING city_name, population;



-----VIEW-----
//создание view
CREATE VIEW view_name AS
SELECT column1, column2
FROM table_name
WHERE condition;

//материализованное view
CREATE MATERIALIZED VIEW view_name AS
SELECT column1, column2
FROM table_name
WHERE condition;

//удалить view
DROP VIEW [IF EXIST] view_name;

//обновить view
CREATE OR REPLACE VIEW view_name AS
SELECT...

//обновить материализованное view
REPLACE MATERIALIZED VIEW view_name;

//вывести все столицы стран в европе с их странами и населением
CREATE VIEW european_countries AS
SELECT c.city_name, co.country_name, c.population
FROM cities c INNER JOIN countries co ON c.country_id = co.country_id
INNER JOIN continents con ON co.continent_id = con.continent_id
WHERE continent_name = 'Europe' AND c.is_capital = TRUE;

//вывести все города с населением при помощи VIEW european_countries (сортировать по убыванию по населению)
SELECT ec.city_name, ec.population FROM european_countries ec
ORDER BY ec.population DESC



-----INDEX-----
//создать индекс для достопримечательностей по типу и id города
CREATE INDEX idx_landmarks_type_city ON landmarks(type, city_id);