package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.ConsommableDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.TacheDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Consommable;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Tache;

import java.util.List;

@RestController
@RequestMapping("/api/tache")
public class TacheController {

    @Autowired
    private TacheDao tacheDao;

    @GetMapping("/")
    public List<Tache> getAllTache() {
        return tacheDao.findAll();
    }
}
