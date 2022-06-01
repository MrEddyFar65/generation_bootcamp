-- Borrar

SELECT * FROM mascota;

-- Borrar la fila 
DELETE FROM mascota WHERE mascota_id = 4;

-- Borrar una columna
ALTER TABLE mascota DROP COLUMN cumpleanios;

-- borrar tabla
DROP TABLE mascota;


-- borrar database
DROP DATABASE familia;