Gestion des comptes:
	Code int (10),
Nom du parieur vachar(50), 
Prénom varchar(50),
Sexe ENUM (‘M’, ‘F’) DEFAULT ‘M’, 
Adresse varchar(100), 
Lieu de naissance varchar(20),
Date de naissance DATE,
Téléphone int(15),
NIF/CIN in(20),
Nom utilisateur varchar(50),
Mot de passe int(16),
Solde double(9,2),
ETAT ENUM(‘ACTIF’, ‘SUPPRIMER’, ‘FERMER’) DEFAULT ‘ACTIF’ );ID


Matches:
 ID INT(10),
 Type de match VARCHAR(15),
 Pays VARCHAR(30) 
Date match DATE, 
Heure match DATETIME,
 Equipe receveuse VARCHAR(50),
 Equipe visiteuse VARCHAR(50) ; 
Cote DOUBLE(9,2),
 Prix fiche DOUBLE(9,2), 
Score final  INT(3),
ETAT ENUM(‘NON ENCORE JOUE’, ‘EN COURS’, ‘TERMINE’, ‘ANNULE’, ‘SUPPRIME’) DEFAULT ‘NON ENCORE JOUE’ ;
Pariage 
 ID INT(16),
#ID Compte INT(16),
 #ID Match INT(16),
 Date pariage DATE,
 Score prévu VARCHAR(15),

Paiements  
ID_PAIEMENT INT(16), 
#ID_Pariage INT(16),
Date_paiement DateTIME.

Ajout des clés primaires
alter table g_comptes add constraint pk_code primary key (code) ;
alter table matches add constraint pk_id primary key (id_matches) ;
ALTER TABLE pariage add constraint pk_id_pariage primary key (id_pariage);
ALTER TABLE paiements add constraint pk_id_paiements primary key (id_paiements);

Ajout des clés etrangères
Alter table pariage add constraint fk_id_match foreign key(id_matches) references matches(id_matches);
ALTER TABLE pariage ADD CONSTRAINT fk_CODE FOREIGN KEY (CODE) REFERENCES g_comptes(CODE);
Alter table paiements add constraint fk_id_pariage foreign key(id_pariage) references pariage(id_pariage);


