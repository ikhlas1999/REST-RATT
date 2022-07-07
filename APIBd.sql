create database APIBd;
use APIBd;

CREATE TABLE Personne (
    id int NOT NULL AUTO_INCREMENT,
    cin varchar(255) NOT NULL,
	nom varchar(255) NOT NULL,
	prenom varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
insert into personne (id, cin, nom, prenom) values (1, 'F54', 'Elherrouf', 'Ikhlas');
insert into personne (id, cin, nom, prenom) values (2, 'AFF', 'ALAOUI', 'ISMAIL');
insert into personne (id, cin, nom, prenom) values (3, 'AEF', 'AAAA', 'AMINA');
insert into personne (id, cin, nom, prenom) values (4, 'IVTY', 'ALAoui', 'ALAOUI');
insert into personne (id, cin, nom, prenom) values (5, 'MBRX', 'ABEH', 'tffydj');
