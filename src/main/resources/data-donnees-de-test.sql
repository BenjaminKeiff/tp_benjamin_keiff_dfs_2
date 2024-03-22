INSERT INTO Role (designation) VALUES ('Chef');
INSERT INTO Role (designation) VALUES ('Ouvrier');
INSERT INTO Role (designation) VALUES ('Client');

INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('snake', 'azerty', 1);
INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('raiden', 'azerty', 2);
INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('otacon', 'azerty', 3);

INSERT INTO Chantier (nom, chef, client) VALUES ("Paris",1, 2);
INSERT INTO Chantier (nom, chef, client) VALUES ("Rombas",2, 3);
INSERT INTO Chantier (nom, chef, client) VALUES ("Metz",3, 1);

INSERT INTO Tache (nom, temps) VALUES ('Tâche 1', 6000);
INSERT INTO Tache (nom, temps) VALUES ('Tâche 2', 3000);
INSERT INTO Tache (nom, temps) VALUES ('Tâche 3', 4500);

INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 1', '2024-03-22', 1, 1, 1);
INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 2', '2024-03-23', 2, 2, 2);
INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 3', '2024-03-24', 3, 3, 3);

INSERT INTO Consommable (nom) VALUES ('Consommable 1');
INSERT INTO Consommable (nom) VALUES ('Consommable 2');
INSERT INTO Consommable (nom) VALUES ('Consommable 3');

