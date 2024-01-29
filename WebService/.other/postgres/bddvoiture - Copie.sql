create database cars_dealer;
\c cars_dealer;

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

create table voiture(
    id SERIAL primary key, 
    idUser SERIAL references user(id),
    idModele SERIAL references modele(id),
    idTypeCarburant SERIAL references typeCarburant(id), 
    kilometrage int,
    couleur varchar(20),
    prix real
);
create table caracteristiqueVoiture(
    id SERIAL primary key,
    idVoiture SERIAL references voiture(id),
    idCaracteristique SERIAL references caracteristique(id),
    valeur int -- 1(oui) 0(non)
);
create table imageVoiture(
    id SERIAL primary key,
    idVoiture SERIAL references voiture(id),
    urlImage varchar(50)
);




create table marque(
    id varchar(10) primary key,
    nom varchar(50)
);
create table typeCarburant(
    id varchar(10) primary key,
    nom varchar(50)
);
create table caracteristique(
    id varchar(10) primary key,
    nom varchar(50)
);
create table modele(
    id varchar(10) primary key, 
    idMarque varchar(10) references marque(id), 
    nom varchar(50)
);


create sequence personnesequence start with 1;
create sequence usersequence start with 1;
create sequence marquesequence start with 1;
create sequence typeCarburantsequence start with 1;
create sequence caracteristiquesequence start with 1;
create sequence modelesequence start with 1;
create sequence voituresequence start with 1;
create sequence caracteristiqueVoituresequence start with 1;
create sequence imageVoituresequence start with 1;



insert into personne values 
    ('PERS'||nextval('personnesequence'), 'Andriamalala', 'Tsanta', '2002-01-02', 1),
    ('PERS'||nextval('personnesequence'), 'Rasolomanana', 'Navalona', '2003-02-09', 2),
    ('PERS'||nextval('personnesequence'), 'Ratovoson', 'Steven', '2003-02-17', 1);
    
insert into user values    
    ('USER'||nextval('usersequence'), 'PERS1', 'tsanta@gmail.com', '0000'),
    ('USER'||nextval('usersequence'), 'PERS2', 'navalona@gmail.com', '0000'),
    ('USER'||nextval('usersequence'), 'PERS3', 'steven@gmail.com', '0000');

insert into marque values
    ('MARQ'||nextval('marquesequence'), 'Toyota'),
    ('MARQ'||nextval('marquesequence'), 'Honda'),
    ('MARQ'||nextval('marquesequence'), 'Ford'),
    ('MARQ'||nextval('marquesequence'), 'BMW'),
    ('MARQ'||nextval('marquesequence'), 'Volkswagen');

insert into typeCarburant values
    ('CARB'||nextval('typeCarburantsequence'), 'Essence'),
    ('CARB'||nextval('typeCarburantsequence'), 'Diesel'),
    ('CARB'||nextval('typeCarburantsequence'), 'Hybride'),
    ('CARB'||nextval('typeCarburantsequence'), 'Electrique'),
    ('CARB'||nextval('typeCarburantsequence'), 'Gaz naturel'); 
   
insert into caracteristique values
    ('CART'||nextval('caracteristiquesequence'), 'Climatisation'),
    ('CART'||nextval('caracteristiquesequence'), 'Toit ouvrant'),
    ('CART'||nextval('caracteristiquesequence'), 'Systeme de navigation'),
    ('CART'||nextval('caracteristiquesequence'), 'Camera de recul'),
    ('CART'||nextval('caracteristiquesequence'), 'Sieges chauffants');

insert into modele values
    ('MOD'||nextval('modelesequence'), 'MARQ1', 'Camry'),
    ('MOD'||nextval('modelesequence'), 'MARQ1', 'Corolla'),
    ('MOD'||nextval('modelesequence'), 'MARQ1', 'RAV4'),
    ('MOD'||nextval('modelesequence'), 'MARQ1', 'Prius'),
    ('MOD'||nextval('modelesequence'), 'MARQ1', 'Highlander'),
    ('MOD'||nextval('modelesequence'), 'MARQ2', 'Civic'),
    ('MOD'||nextval('modelesequence'), 'MARQ2', 'Accord'),
    ('MOD'||nextval('modelesequence'), 'MARQ2', 'CR-V'),
    ('MOD'||nextval('modelesequence'), 'MARQ2', 'Pilot'),
    ('MOD'||nextval('modelesequence'), 'MARQ2', 'Odyssey'),
    ('MOD'||nextval('modelesequence'), 'MARQ3', 'Mustang'),
    ('MOD'||nextval('modelesequence'), 'MARQ3', 'Explorer'),
    ('MOD'||nextval('modelesequence'), 'MARQ3', 'Fusion'),
    ('MOD'||nextval('modelesequence'), 'MARQ3', 'Escape'),
    ('MOD'||nextval('modelesequence'), 'MARQ3', 'F-150'),
    ('MOD'||nextval('modelesequence'), 'MARQ4', '3 Series'),
    ('MOD'||nextval('modelesequence'), 'MARQ4', '5 Series'),
    ('MOD'||nextval('modelesequence'), 'MARQ4', '7 Series'),
    ('MOD'||nextval('modelesequence'), 'MARQ4', 'X3'),
    ('MOD'||nextval('modelesequence'), 'MARQ4', 'X7'),
    ('MOD'||nextval('modelesequence'), 'MARQ5', 'Golf'),
    ('MOD'||nextval('modelesequence'), 'MARQ5', 'Jetta'),
    ('MOD'||nextval('modelesequence'), 'MARQ5', 'Passat'),
    ('MOD'||nextval('modelesequence'), 'MARQ5', 'Tiguan'),
    ('MOD'||nextval('modelesequence'), 'MARQ5', 'Atlas');

