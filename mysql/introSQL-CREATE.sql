-- Crear

-- Crear una base de datos
-- CREATE SCHEMA familia
CREATE DATABASE familia; 

-- seleccion de base de datos
USE familia;

-- crear tabla de personas
-- al crear una tabla es necesario pner minimo una fila
-- por defecto el valor asignado es NULL
-- para agregar valores unicos se usa UNIQUE
CREATE TABLE persona(
	persona_id int auto_increment,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    estado VARCHAR(255) DEFAULT "desconocido",
    cumpleanios DATE,
    PRIMARY KEY (persona_id),
    CONSTRAINT email_unico UNIQUE(correo)
);

INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values
('SanDiego','deigoPro@gmail.com', 66, 'sad','1956-08-11'),
('Yair', 'yair@gmail.com', 24, 'happy', '1985-05-31');

-- ingresar datos que no son necesarios
INSERT INTO persona(nombre, correo, edad, estado) values
( 'Pepe', 'pepe@gmail.com', 34, 'Alegre');

-- ingresar datos de valor por defecto
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Tonito', 'supertonio@gmail.com', 55, '1970-09-22');

SELECT * FROM persona;

CREATE TABLE mascota(
	mascota_id int auto_increment,
    nombre VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    fk1_persona int NOT NULL,
    PRIMARY KEY (mascota_id),
    FOREIGN KEY(fk1_persona) REFERENCES persona(persona_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

SELECT * FROM mascota;

INSERT INTO mascota(nombre,edad, fk1_persona) values
('Leo',3,1);
INSERT INTO mascota(nombre,edad, fk1_persona) values
('Tobi', 9,1);

INSERT INTO mascota(nombre,edad, fk1_persona) values
('Beni', 12,2),
('Patitas',3, 4);

