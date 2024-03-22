package tp.benjamin.tp_benjamin_keiff_dfs_2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Consommable;

@Repository
public interface ConsommableDao extends JpaRepository<Consommable, Long> {
}