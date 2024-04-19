package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/sumit")
public class FirstController {

    DAOInterface daoInterface;

    @Autowired
    public FirstController(DAOInterface daoInterface){
        this.daoInterface=daoInterface;
    }


    @GetMapping("/getAll")
    public List<OrderModel> getAllData(){
        return daoInterface.getAllOrders();
    }
    @PostMapping("/addOne")
    public long addOne(@RequestBody OrderModel modelVariable){
        return daoInterface.addOne(modelVariable);
    }
    @GetMapping("/getById/{anyId}")
    public OrderModel getById(@PathVariable("anyId") long id){
        return daoInterface.getById(id);
    }
    @GetMapping("/search/{searchTerm}")
    public List<OrderModel> searchIt(@PathVariable("searchTerm") String search){
        return daoInterface.searchOrder(search);
    }

}
