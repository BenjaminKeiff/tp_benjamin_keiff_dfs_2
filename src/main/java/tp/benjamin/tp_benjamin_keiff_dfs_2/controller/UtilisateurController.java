package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.UtilisateurDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Utilisateur;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/")
    public List<Utilisateur> getAllUser() {
        return utilisateurDao.findAll();
    }


    @PostMapping("/")
    public Utilisateur createUser(@RequestBody Utilisateur utilisateur) {
        return utilisateurDao.save(utilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        utilisateurDao.deleteById(id);
    }
}