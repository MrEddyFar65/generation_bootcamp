-- LEER

-- muestra  las bases de datos disponibles
SHOW DATABASES;

USE sakila;

SELECT * FROM city;

SELECT city, city_id FROM city;

-- limitar la cantidad de datos 
SELECT * FROM actor limit 10;

-- odernar los datos dependiendo una columna
SELECT * FROM city ORDER BY last_update DESC;

-- ordenar los datos dependiendo de una columna de forma descendente 
SELECT * FROM city ORDER BY country_id DESC; 

SELECT * FROM actor;

-- seleccionar de la tabla los que terminen con 'an'

SELECT * FROM actor WHERE first_name LIKE "%an";


SELECT * FROM actor WHERE first_name REGEXP 'NNE';