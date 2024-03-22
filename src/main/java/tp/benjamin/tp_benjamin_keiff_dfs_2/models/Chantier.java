package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Chantier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idChantier;

    protected String nom;

    @ManyToOne
    @JoinColumn(name = "chef")
    protected Utilisateur chef;

    @ManyToOne
    @JoinColumn(name = "client")
    protected Utilisateur client;
}
