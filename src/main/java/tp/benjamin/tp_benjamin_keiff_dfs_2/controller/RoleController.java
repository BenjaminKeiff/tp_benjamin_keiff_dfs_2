package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.RoleDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Role;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleDao roleDao;

    @GetMapping("/")
    public List<Role> getAllRoles() {
        return roleDao.findAll();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleDao.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Role createRole(@RequestBody Role role) {
        return roleDao.save(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleDao.deleteById(id);
    }
}
