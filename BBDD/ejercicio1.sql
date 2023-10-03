DROP DATABASE IF EXISTS academia;
CREATE DATABASE academia;
USE academia;
DROP TABLE IF EXISTS ALUMNOS;
DROP TABLE IF EXISTS PROFESORES;
DROP TABLE IF EXISTS CURSOS;
CREATE TABLE PROFESORES(
	NIF VARCHAR(10) PRIMARY KEY,
	Nombre VARCHAR(40) UNIQUE,
	Apellido1 VARCHAR(20) NOT NULL,
	Apellido2 VARCHAR(20) NOT NULL,
	Direccion VARCHAR(100) NOT NULL,
	Titulación VARCHAR(300) NOT NULL,
	Salario_Mes8 DECIMAL(4,2) NOT NULL
);

CREATE TABLE CURSOS (
	id INT AUTO_INCREMENT PRIMARY KEY,
	Nombre VARCHAR(20) UNIQUE,
	Max_Alumn INT NOT NULL,
	Fecha_In DATE NOT NULL,
	Fecha_Fin DATE NOT NULL,
	Num_Horas INT NOT NULL CHECK (Num_Horas>0),
	NIF_Profesor VARCHAR(9) NOT NULL,
	FOREIGN KEY (NIF_Profesor) REFERENCES PROFESORES(NIF) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE ALUMNOS(
	NIF VARCHAR(10) PRIMARY KEY,
	Nombre VARCHAR(40) NOT NULL,
	Apellido1 VARCHAR(20) NOT NULL,
	Apellido2 VARCHAR(20) NOT NULL,
	Direccion VARCHAR(100) NOT NULL,
	Sexo ENUM("H", "M") NOT NULL,
	Fecha_de_Nacimiento DATE NOT NULL,
	Curso INT NOT NULL,
	FOREIGN KEY (Curso) REFERENCES CURSOS(id) ON DELETE CASCADE ON UPDATE CASCADE
);



