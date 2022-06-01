-- ACTUALIZAR 

-- Agregar una columna
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- Agregar columna en posicion especifica 
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad;

-- Modificar las caracterisitcas de una columna
ALTER TABLE mascota MODIFY cumpleanios VARCHAR(255) NOT NULL;

-- Cambiar el nombre de la columna (sobre-escribir)
ALTER TABLE mascota CHANGE COLUMN edad edadP int NOT NULL;

-- Renombrar la tabla 
ALTER TABLE mascota RENAME mascotita;

SELECT * FROM mascota;

-- Error 1175: No podemos actualizar sino seleccionamos la llave primaria
UPDATE mascota SET especie = "Gato" WHERE nombre = "Leo";

-- Forma Correcta 
UPDATE mascota SET especie = "Gato" WHERE mascota_id = 1;
UPDATE mascota SET especie = "Perro", edadP = 10 WHERE mascota_id = 2;  