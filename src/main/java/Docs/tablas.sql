CREATE TABLE equipo (
    id_equipo      	integer PRIMARY KEY,
    nom 		varchar(40) NOT NULL
);

CREATE TABLE empresa (
    num_entidad_fiscal integer PRIMARY KEY,
    nom      		varchar(40) NOT NULL,
    presupuesto   	integer
);

CREATE TABLE jugador (
    id_persona      	integer PRIMARY KEY,
    id_equipo 		integer NOT NULL,
    nom   		varchar(40) NOT NULL,
    dorsal      	integer NOT NULL,
    patrocinador       integer,

    FOREIGN KEY (patrocinador)
      REFERENCES empresa (num_entidad_fiscal)
    FOREIGN KEY (id_equipo)
      REFERENCES equipo (id_equipo)
);

CREATE TABLE partido (
    id_partido      	integer PRIMARY KEY,
    id_equipo_local 	integer NOT NULL,
    id_equipo_visitante 	integer NOT NULL,
    fecha 	date,
    FOREIGN KEY (id_equipo_local)
      REFERENCES equipo (id_equipo),
    FOREIGN KEY (id_equipo_visitante)
      REFERENCES equipo (id_equipo)
);

