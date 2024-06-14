  CREATE TABLE ESTUDIANTE
        (        
        id NUMERIC(16) NOT NULL AUTO_INCREMENT,
        nombre VARCHAR2(40) NOT NULL,
        apellido VARCHAR2(40) NOT NULL UNIQUE,
        email VARCHAR2(40) NOT NULL,
        creditos INTEGER NOT NULL,       
        semestre INTEGER NOT NULL,       
        promedio NUMERIC(10,2) NOT NULL,
        estado INTEGER NOT NULL,         
        PRIMARY KEY(id)
        );
 
 