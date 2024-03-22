package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.*;

@Entity
public class Chantier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChantier;

    @ManyToOne
    @JoinColumn(name = "chef")
    private Utilisateur chef;

    @ManyToOne
    @JoinColumn(name = "client")
    private Utilisateur client;
}
