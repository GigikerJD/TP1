CREATE DATABASE db_altn72;

USE db_altn72;

DROP TABLE IF EXISTS PASSAGER;
-- Création de la table PASSAGER
CREATE TABLE PASSAGER (
ID INT NOT NULL AUTO_INCREMENT,
NOM VARCHAR(50) NOT NULL,
PRENOM VARCHAR(50) NOT NULL,
PIECE_IDENTITE VARCHAR(150) NOT NULL,
NUMERO_IDENTITE VARCHAR(10) NOT NULL,
NUMERO_RESERVATION VARCHAR(7) NOT NULL,
COMMENTAIRES VARCHAR(250) NOT NULL,
PRIMARY KEY (ID)
);
-- Insertion de 6 membres
INSERT INTO PASSAGER (NOM, PRENOM, PIECE_IDENTITE, NUMERO_IDENTITE,
NUMERO_RESERVATION, COMMENTAIRES)
VALUES
('Augustin', 'Jacques', 'Passeport', 'FR123456', 'RES001', 'A besoin de 3
oreillers pour dormir correctement.'),
('Gning', 'Babacar', 'Carte d\'identité', 'FR654321', 'RES002',
'Préfèrerait un siège près des toilettes.'),
('Séïde', 'Nathalie', 'Passeport', 'FR789012', 'RES003', 'Allergique aux
cacahuètes et aux voisins bruyants.'),
('Chèrenfant', 'Stéphanie', 'Carte d\'identité', 'FR098765', 'RES004',
'Voudrait que l\'avion atterrisse 10 minutes plus tôt.'),
('Calixte', 'Carl-Edouard', 'Passeport', 'FR345678', 'RES005', 'Rêve
d\'avoir un espace VIP juste pour lui.'),
('Vazquez', 'Lorenzo', 'Carte d\'identité', 'FR876543', 'RES006', 'Besoin
impératif de pouvoir étirer ses jambes.'),
('Fu', 'Yajuan', 'Passeport', 'FR567890', 'RES007', 'Espère secrètement un
surclassement en première classe.'),
('De Oliveira', 'Magalie', 'Carte d\'identité', 'FR432109', 'RES008',
'Demande un coussin avec des plumes d\'oie.'),
('Lambertini', 'Alexandre', 'Passeport', 'FR213456', 'RES009', 'Ne souhaite
pas être dérangé. Sauf à l\'arrivée.'),
('Benski', 'Laura', 'Carte d\'identité', 'FR098123', 'RES010', 'Demande que
la climatisation à bord soit maximale.');

SELECT * FROM passager;