package tp.benjamin.tp_benjamin_keiff_dfs_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.ConsommableDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.dao.OperationDao;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Consommable;
import tp.benjamin.tp_benjamin_keiff_dfs_2.models.Operation;

import java.util.List;

@RestController
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    private OperationDao operationDao;

    @GetMapping("/")
    public List<Operation> getAllOperation() {
        return operationDao.findAll();
    }
}