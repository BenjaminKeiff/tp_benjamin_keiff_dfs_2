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
    private Long idChantier;

    @ManyToOne
    @JoinColumn(name = "chef")
    private Utilisateur chef;

    @ManyToOne
    @JoinColumn(name = "client")
    private Utilisateur client;
}
