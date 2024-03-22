package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.ChantierDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.ConsommableDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Chantier;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Consommable;

import java.util.List;

@RestController
@RequestMapping("/consommable")
public class ConsommableController {

    @Autowired
    private ConsommableDao consommableDao;

    @GetMapping("/")
    public List<Consommable> getAllConsommable() {
        return consommableDao.findAll();
    }
}