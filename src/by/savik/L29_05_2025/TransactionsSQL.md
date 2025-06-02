
------Transaction------
BEGIN;
UPDATE accounts SET balance = balance - 100 WHERE user_id = 1;
UPDATE accounts SET balance = balance + 100 WHERE user_id = 2;
COMMIT;


------Пример с ROLLBACK------
DO $$
DECLARE
city_count INTEGER;
BEGIN
BEGIN -- Начало транзакции
-- Добавляем новый город
INSERT INTO world_geo.cities (city_name, country_id, population)
VALUES ('New City', 1, 1000000);

        -- Проверяем количество городов в стране
        SELECT COUNT(*) INTO city_count 
        FROM world_geo.cities 
        WHERE country_id = 1;
        
        IF city_count > 10 THEN
            RAISE EXCEPTION 'Слишком много городов в стране';
        END IF;
        
        COMMIT;
        RAISE NOTICE 'Транзакция успешно завершена';
        
    EXCEPTION WHEN others THEN
        ROLLBACK;
        RAISE NOTICE 'Транзакция откачена: %', SQLERRM;
    END;
END $$;


------Устанавливаем уровень транзакции------
BEGIN;
SET TRANSACTION ISOLANION LEVEL SERIALIZABLE;
UPDATE accounts SET balance = balance - 100 WHERE user_id = 1;
...
...
COMMIT;