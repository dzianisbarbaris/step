0. Получить список всех стран с их столицами, континентами и языками

SELECT c.country_name as Страна, c.capital AS Столица, cont.continent_name AS Континент, l.language_name AS Языки
FROM countries c INNER JOIN continents cont ON c.continent_id = cont.continent_id
INNER JOIN country_languages cl ON c.country_id = cl.country_id INNER JOIN languages l ON l.language_id = cl.language_id ;

1. Все страны с населением более 100 миллионов. Сортировка от крупных к менее.

SELECT country_name FROM countries WHERE population > 100000000 ORDER BY population DESC;

2. Города с населением более 5 миллионов (не столицы). Сортировка от крупных к менее.

SELECT city_name FROM cities
WHERE population > 5000000 AND is_capital = FALSE
ORDER BY population DESC ;

3. Страны в Европе

SELECT c.country_name FROM countries c RIGHT JOIN continents cont ON c.continent_id = cont.continent_id
WHERE continent_name = Europe;

4. Количество городов в каждой стране

SELECT c.country_name AS "Страна", COUNT(cit.city_name) AS "Кол-во городов" FROM countries c INNER JOIN cities cit ON c.country_id = cit.country_id
GROUP BY c.country_name;

5. Все официальные языки в Швейцарии

SELECT l.language_name FROM languages l INNER JOIN country_languages cl ON l.language_id = cl.language_id
INNER JOIN countries c ON cl.country_id = c.country_id WHERE country_name = 'Switzerland';

6. Достопримечательности культурного типа (Cultural)

SELECT l.landmark_name FROM landmarks l WHERE l.type = 'Cultural';

7. Среднее население городов по странам. Сортировка от крупных к менее.

SELECT c.country_name, AVG(cit.population) FROM countries c INNER JOIN cities cit ON c.country_id = cit.country_id
GROUP BY country_name
ORDER BY 2 DESC ;

8. Самые древние города (основаны до 1000 года) Сортировка от древних к менее.

SELECT c.city_name FROM cities c WHERE c.foundation_year < 1000
ORDER BY foundation_year;

9. Столицы с населением менее 1 миллиона

SELECT c.city_name FROM cities c
WHERE is_capital = TRUE AND population > 1000000;

10. Языки, на которых говорят в Индии

    SELECT l.language_name FROM languages l INNER JOIN country_languages cl ON l.language_id = cl.language_id
    INNER JOIN countries c ON cl.country_id = c.country_id WHERE country_name = 'India'

11. Вывести топ-5 стран с самыми большими столицами по населению

SELECT c.country_name FROM countries c INNER JOIN cities cit ON c.country_id = cit.country_id
WHERE cit.is_capital  = TRUE
ORDER BY cit.population DESC LIMIT 5;

12. Подсчитать общее население каждого континента

SELECT c.continent_name, c.population FROM continents c ORDER BY c.population DESC;

13. Получить список всех стран с их столицами, континентами и языками

SELECT c.country_name as Страна, c.capital AS Столица, cont.continent_name AS Континент, l.language_name AS Языки
FROM countries c INNER JOIN continents cont ON c.continent_id = cont.continent_id
INNER JOIN country_languages cl ON c.country_id = cl.country_id INNER JOIN languages l ON l.language_id = cl.language_id ;

14. Найти страны, где английский язык является официальным

SELECT c.country_name FROM countries c INNER JOIN country_languages cl ON c.country_id = cl.country_id
INNER JOIN languages l ON cl.language_id = l.language_id
WHERE cl.is_official = TRUE AND l.language_name = 'English';

15. Получить список достопримечательностей с описанием и типом, построенных до 1800 года

SELECT l.landmark_name AS "Landmark", l.description AS "Description", l.type AS "Type" FROM landmarks l
WHERE l.year_built < 1800;

16. Найти страны с наибольшей площадью, входящие в топ-5

SELECT c.country_name FROM countries c
ORDER BY area_sq_km DESC LIMIT 5;

17. Найти страны, где более 80% населения говорит на официальном языке

SELECT c.country_name FROM countries c INNER JOIN country_languages cl ON c.country_id = cl.country_id
WHERE cl.percentage > 80;

18. Вывести список всех стран с их крупнейшим городом

WITH top_cities AS (SELECT * FROM cities cit
WHERE cit.population = ( SELECT MAX(population)
FROM cities c
WHERE c.country_id = cit.country_id))
SELECT ct.country_name, ts.city_name, ts.population FROM countries ct INNER JOIN top_cities ts ON ct.country_id = ts.country_id;

SELECT DISTINCT ON (c.country_name) c.country_name, ci.city_name, ci.population
FROM countries c
INNER JOIN cities ci ON c.country_id = ci.country_id
ORDER BY c.country_name, ci.population DESC;


19. Найти топ-3 страны с наибольшей средней плотностью населения в их городах

SELECT c.country_name, AVG(ci.population/ c.area_sq_km) as avg_city_density
FROM countries c
JOIN cities ci ON c.country_id = ci.country_id
WHERE c.area_sq_km > 0
GROUP BY c.country_name
ORDER BY avg_city_density DESC
LIMIT 3;

20. Найти все континенты, где суммарное население стран больше 1 миллиарда, и вывести их страны

SELECT con.continent_name, c.country_name
FROM continents con
JOIN countries c ON con.continent_id = c.continent_id
WHERE con.continent_id IN (
SELECT c2.continent_id
FROM countries c2
GROUP BY c2.continent_id
HAVING SUM(c2.population) > 1000000000
)
ORDER BY 1, 2

21. Найти страну с наибольшим количеством официальных языков
    
SELECT c.country_name, COUNT(language_id)
FROM countries c
JOIN country_languages cl ON c.country_id = cl.country_id
GROUP BY c.country_name
ORDER BY 2 DESC LIMIT 1;


22. Найти города с достопримечательностями, построенными до 1000 года, и отсортировать их по древности

SELECT c.city_name, l.landmark_name, l.year_built FROM cities c INNER JOIN landmarks l ON c.city_id = l.city_id
WHERE year_built < 1000
ORDER BY year_built

23. Найти страны, у которых площадь меньше 1% от площади их континента

SELECT c.country_name FROM countries c INNER JOIN continents con ON c.continent_id = con.continent_id
WHERE c.area_sq_km < con.area_sq_km * 0.01;


