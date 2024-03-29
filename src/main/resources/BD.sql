Create database lol;

use lol;

create table personajes(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50),
	genero VARCHAR(50),
	recurso VARCHAR(50),
	alcance VARCHAR(50),
	anyo INT
);


create table posiciones(
	id INT AUTO_INCREMENT PRIMARY KEY,
	posicion VARCHAR(50)
);

create table personajes_posiciones(
	id INT AUTO_INCREMENT PRIMARY KEY,
	personaje_id INT,
	posicion_id INT,
	FOREIGN KEY (personaje_id) REFERENCES personajes(id),
	FOREIGN KEY (posicion_id) REFERENCES posiciones(id)
);

create table habilidades(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50),
	tecla VARCHAR(1),
	personaje_id INT,
	FOREIGN KEY (personaje_id) REFERENCES personajes(id) on delete cascade
);

insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Aatrox", "macho", "vida", "melee", 2013);
insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Kayn", "macho", "mana", "melee", 2017);
insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Vex", "hembra", "mana", "rango", 2021);
insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Jinx", "hembra", "mana", "rango", 2009);
insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Blitzcrank", "Otro", "mana", "melee", 2009);
insert into personajes (nombre, genero, recurso, alcance, anyo) values ("Jayce", "macho", "mana", "ambos", 2012);


insert into posiciones (posicion) values ("top");
insert into posiciones (posicion) values ("jungla");
insert into posiciones (posicion) values ("mid");
insert into posiciones (posicion) values ("adc");
insert into posiciones (posicion) values ("support");


insert into personajes_posiciones (personaje_id, posicion_id) values (1, 1);
insert into personajes_posiciones (personaje_id, posicion_id) values (2, 2);
insert into personajes_posiciones (personaje_id, posicion_id) values (3, 3);
insert into personajes_posiciones (personaje_id, posicion_id) values (4, 4);
insert into personajes_posiciones (personaje_id, posicion_id) values (5, 5);
insert into personajes_posiciones (personaje_id, posicion_id) values (6, 1);
insert into personajes_posiciones (personaje_id, posicion_id) values (6, 3);


insert into habilidades (nombre, tecla, personaje_id) values ("LA ESPADA DARKIN", "Q", 1);
insert into habilidades (nombre, tecla, personaje_id) values ("CADENAS INFERNALES", "W", 1);
insert into habilidades (nombre, tecla, personaje_id) values ("IMPULSO SINIESTRO", "E", 1);
insert into habilidades (nombre, tecla, personaje_id) values ("DESTRUCTOR DE MUNDOS", "R", 1);

insert into habilidades (nombre, tecla, personaje_id) values ("CORTE DE GUADAÑA", "Q", 2);
insert into habilidades (nombre, tecla, personaje_id) values ("GOLPE DE HOJA", "W", 2);
insert into habilidades (nombre, tecla, personaje_id) values ("PASOS DE SOMBRA", "E", 2);
insert into habilidades (nombre, tecla, personaje_id) values ("INVASIÓN SOMBRÍA", "R", 2);

insert into habilidades (nombre, tecla, personaje_id) values ("Proyectil mistral", "Q", 3);
insert into habilidades (nombre, tecla, personaje_id) values ("Espacio personal", "W", 3);
insert into habilidades (nombre, tecla, personaje_id) values ("Oscuridad amenazante", "E", 3);
insert into habilidades (nombre, tecla, personaje_id) values ("Estallido sombrío", "R", 3);

insert into habilidades (nombre, tecla, personaje_id) values ("¡CAMBIAZO!", "Q", 4);
insert into habilidades (nombre, tecla, personaje_id) values ("¡ZAP!", "W", 4);
insert into habilidades (nombre, tecla, personaje_id) values ("¡MASCAFUEGOS!", "E", 4);
insert into habilidades (nombre, tecla, personaje_id) values ("¡SUPERMEGACOHETE MORTAL!", "R", 4);

insert into habilidades (nombre, tecla, personaje_id) values ("AGARRE COHETE", "Q", 5);
insert into habilidades (nombre, tecla, personaje_id) values ("SOBREMARCHA", "W", 5);
insert into habilidades (nombre, tecla, personaje_id) values ("PUÑO DE PODER", "E", 5);
insert into habilidades (nombre, tecla, personaje_id) values ("CAMPO ESTÁTICO", "R", 5);

insert into habilidades (nombre, tecla, personaje_id) values ("¡HACIA LOS CIELOS!/DESCARGA ELÉCTRICA", "Q", 6);
insert into habilidades (nombre, tecla, personaje_id) values ("CAMPO ELECTRIFICADO/HIPERCARGA", "W", 6);
insert into habilidades (nombre, tecla, personaje_id) values ("GOLPE RELÁMPAGO/PORTAL DE ACELERACIÓN", "E", 6);
insert into habilidades (nombre, tecla, personaje_id) values ("CAÑÓN DE MERCURIO/MARTILLO DE MERCURIO", "R", 6);

