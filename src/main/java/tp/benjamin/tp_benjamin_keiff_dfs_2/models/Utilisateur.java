package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    private String pseudo;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

}