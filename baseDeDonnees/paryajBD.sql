Create database paryaj_spotif;
connect database paryaj_spotif;

Create table g_comptes(
Code int (10),
Nom_du_parieur vachar(50), 
Prénom varchar(50), 
Sexe ENUM (‘M’, ‘F’) DEFAULT ‘M’, 
Adresse varchar(100), 
Lieu_de_naissance varchar(20),
Date_de_naissance DATE,
Téléphone int(15),
NIF/CIN in(20),
Nom_utilisateur varchar(50),
Mot_de_passe int(16),
Solde double(9,2),
ETAT ENUM(‘ACTIF’, ‘SUPPRIMER’, ‘FERMER’) DEFAULT ‘ACTIF’ );

Create table matches(
 ID INT(10),
 Type_de_match VARCHAR(15),
 Pays VARCHAR(30),
 Date_match DATE, 
 Heure_match DATETIME,
 Equipe_receveuse VARCHAR(50),
 Equipe_visiteuse VARCHAR(50),
 Cote DOUBLE(9,2),
 Prix_fiche DOUBLE(9,2), 
 Score_final  INT(3),
 ETAT ENUM(‘NON ENCORE JOUE’, ‘EN COURS’, ‘TERMINE’, ‘ANNULE’, ‘SUPPRIME’) DEFAULT ‘NON ENCORE JOUE’ );

Create table pariages(
 ID INT(16),
 ID_Compte INT(16),
 ID_Match INT(16),
 Date_pariage DATE,
 Score_prévu VARCHAR(15) ),
 
Create table paiements(
ID_PAIEMENT INT(16), 
#ID_Pariage INT(16),
Date_paiement DateTIME );

alter table g_comptes add constraint pk_code primary key (code) ;
alter table matches add constraint pk_id primary key (id_matches) ;
ALTER TABLE pariages add constraint pk_id_pariage primary key (id_pariage);
ALTER TABLE paiements add constraint pk_id_paiements primary key (id_paiements);

Alter table pariages add constraint fk_id_match foreign key(id_matches) references matches(id_matches);
ALTER TABLE pariages ADD CONSTRAINT fk_CODE FOREIGN KEY (CODE) REFERENCES g_comptes(CODE);
Alter table paiements add constraint fk_id_pariage foreign key(id_pariage) references pariage(id_pariage);


