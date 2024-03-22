package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;

    private String nom;
    private int temps;

}