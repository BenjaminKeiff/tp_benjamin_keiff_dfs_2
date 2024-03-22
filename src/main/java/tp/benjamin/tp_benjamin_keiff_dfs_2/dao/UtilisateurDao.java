package tp.benjamin.tp_benjamin_keiff_dfs_2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Utilisateur;

import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByPseudo(String pseudoRecherche);

}
