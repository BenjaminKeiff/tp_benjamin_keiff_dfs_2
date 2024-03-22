INSERT INTO Role (designation) VALUES ('Admin');
INSERT INTO Role (designation) VALUES ('Utilisateur');
INSERT INTO Role (designation) VALUES ('Modérateur');

INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('admin', 'admin123', 1);
INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('user1', 'user123', 2);
INSERT INTO Utilisateur (pseudo, password, id_role) VALUES ('user2', 'user456', 2);

INSERT INTO Chantier (chef, client) VALUES (1, 2);
INSERT INTO Chantier (chef, client) VALUES (2, 3);
INSERT INTO Chantier (chef, client) VALUES (3, 1);

INSERT INTO Tache (nom, temps) VALUES ('Tâche 1', 60);
INSERT INTO Tache (nom, temps) VALUES ('Tâche 2', 30);
INSERT INTO Tache (nom, temps) VALUES ('Tâche 3', 45);

INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 1', '2024-03-22', 1, 1, 1);
INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 2', '2024-03-23', 2, 2, 2);
INSERT INTO Operation (nom, operation_date, id_utilisateur, id_tache, id_chantier) VALUES ('Opération 3', '2024-03-24', 3, 3, 3);

INSERT INTO Consommable (nom) VALUES ('Consommable 1');
INSERT INTO Consommable (nom) VALUES ('Consommable 2');
INSERT INTO Consommable (nom) VALUES ('Consommable 3');

