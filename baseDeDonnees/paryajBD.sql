Create database paryaj_spotif;

create table g_comptes(
    code int(10),
    Nom varchar(50),
    Prenom varchar(50),
    Sexe enum("M", "F"),
    adresse varchar(50),
    L_Naissance varchar(50),
    d_Naissance DATE,
    telephone varchar(10),
    NifOuCin varchar(20),
    Nom_utilisateur varchar(50),
    Mot_passe varchar(16) UNIQUE,
    Solde FLOAT,
    etat enum('actif', 'supprimer', 'fermer') default 'actif'
    );

Create table `matches`(
 ID INT(10),
 Type_de_match VARCHAR(15),
 Pays VARCHAR(30),
 Date_match DATE, 
 Heure_match DATETIME,
 Equipe_receveuse VARCHAR(50),
 Equipe_visiteuse VARCHAR(50),
 Cote FLOAT,
 Prix_fiche FLOAT, 
 Score_final  varchar(8),
 ETAT ENUM('NON ENCORE JOUE', 'EN COURS', 'TERMINE', 'ANNULE', 'SUPPRIME') DEFAULT 'NON ENCORE JOUE' 
 );

Create table pariages(
 ID INT(16),
 ID_Compte INT(16),
 ID_Match INT(16),
 Date_pariage DATE,
 Score_prévu VARCHAR(8) );
 
Create table paiements(
ID_PAIEMENT INT(16), 
ID_Pariage INT(16),
Date_paiement DateTIME );

alter table g_comptes add constraint pk_code primary key (code) ;
alter table matches add constraint pk_id primary key (id) ;
ALTER TABLE pariages add constraint pk_id_pariage primary key (id);
ALTER TABLE paiements add constraint pk_id_paiements primary key (id_paiement);

Alter table pariages add constraint fk_id_match foreign key(id_match) references matches(id);
ALTER TABLE pariages ADD CONSTRAINT fk_CODE FOREIGN KEY (ID_Compte) REFERENCES g_comptes(CODE);
Alter table paiements add constraint fk_id_pariage foreign key(id_pariage) references pariages(id);


Alter TABLE pariages Drop FOREIGN key fk_CODE;