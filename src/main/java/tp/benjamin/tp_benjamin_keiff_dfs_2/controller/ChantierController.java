package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.ChantierDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.UtilisateurDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Chantier;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Role;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Utilisateur;

import java.util.List;

@RestController
@RequestMapping("/api/chantier")
public class ChantierController {

    @Autowired
    private ChantierDao chantierDao;

    @GetMapping("/")
    public List<Chantier> getAllChantier() {
        return chantierDao.findAll();
    }

    @GetMapping("/{id}")
    public Chantier getChantierById(@PathVariable Long id) {
        return chantierDao.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Chantier createChantier(@RequestBody Chantier chantier) {
        return chantierDao.save(chantier);
    }

    @DeleteMapping("/{id}")
    public void deleteChantier(@PathVariable Long id) {
        chantierDao.deleteById(id);
    }
}