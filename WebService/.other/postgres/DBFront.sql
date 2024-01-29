create database cars_dealer;
\c cars_dealer;



DROP table caracteristiqueVoiture;
DROP table voiture;
DROP table caracteristique;
DROP table modele;
DROP table marque;
DROP table carburant;
DROP table users;
DROP table personne;



create table personne(
    id SERIAL primary key,
    nom varchar(50),
    prenom varchar(50),
    naissance date, 
    genre int --1(homme) 2(femme) 
);

create table users(
    id SERIAL primary key,
    idPersonne SERIAL references personne(id),
    email varchar(50),
    mdp varchar(50) 
);

create table marque(
    id SERIAL primary key,
    nom varchar(100) 
);

create table modele(
    id SERIAL primary key,
    idMarque INTEGER references marque(id),
    nom varchar(100) 
);

create table carburant(
    id SERIAL primary key,
    nom VARCHAR(100)
);

create table voiture(
    id SERIAL primary key, 
    idUser SERIAL references users(id),
    idModele SERIAL references modele(id),
    idCarburant SERIAL references carburant(id), 
    kilometrage int,
    couleur varchar(20),
    prix real,
    etat INTEGER
);

create table caracteristique(
    id SERIAL primary key,
    nom VARCHAR(100)
);

create table caracteristiqueVoiture(
    id SERIAL primary key,
    idVoiture SERIAL references voiture(id),
    idCaracteristique SERIAL references caracteristique(id)
);


-- Insérer des personnes
INSERT INTO personne (nom, prenom, naissance, genre) VALUES
('Doe', 'John', '1990-01-01', 1),
('Smith', 'Jane', '1985-05-15', 2),
('Johnson', 'Bob', '1978-08-20', 1);


-- Associer des utilisateurs aux personnes existantes
INSERT INTO users (idPersonne, email, mdp) VALUES
(1, 'john.doe@email.com', 'motdepasse1'),
(2, 'jane.smith@email.com', 'motdepasse2'),
(3, 'bob.johnson@email.com', 'motdepasse3');


-- Insérer des marques
INSERT INTO marque (nom) VALUES
('Toyota'),
('Ford'),
('Honda');

-- Insérer des modèles
INSERT INTO modele (idMarque , nom) VALUES
(1,'Camry'),
(2,'Fusion'),
(3,'Civic');

-- Insérer des types de carburant
INSERT INTO carburant (nom) VALUES
('Essence'),
('Diesel'),
('Electrique'),
('Hybride');


-- Insérer des informations sur les voitures
INSERT INTO voiture (idUser, idModele, idCarburant, kilometrage, couleur, prix, etat) VALUES
(1, 1, 1, 50000, 'Rouge', 25000.00, 1),
(2, 2, 2, 80000, 'Bleu', 30000.50, 2),
(3, 3, 3, 20000, 'Vert', 35000.75, 3);

-- Insérer des caractéristiques
INSERT INTO caracteristique (nom) VALUES
('ABS'),
('Airbag'),
('Climatisation');

-- Associer des caractéristiques aux voitures
INSERT INTO caracteristiqueVoiture (idVoiture, idCaracteristique) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 1);




