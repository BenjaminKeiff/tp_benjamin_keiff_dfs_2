package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperation;

    private String nom;
    private Date operationDate;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_tache")
    private Tache tache;

    @ManyToOne
    @JoinColumn(name = "id_chantier")
    private Chantier chantier;

}