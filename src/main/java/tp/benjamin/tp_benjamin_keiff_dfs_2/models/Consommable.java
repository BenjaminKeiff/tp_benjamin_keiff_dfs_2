package tp.benjamin.tp_benjamin_keiff_dfs_2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Consommable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsommable;

    private String nom;
}