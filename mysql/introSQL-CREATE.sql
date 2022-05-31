-- Crear

-- Crear una base de datos
-- CREATE SCHEMA familia
CREATE DATABASE familia; 

-- seleccion de base de datos
USE familia;

-- crear tabla de personas
CREATE TABLE persona(
	persona_id int auto_increment NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    estado VARCHAR(255) NOT NULL,
    cumpleanios DATE NOT NULL
);