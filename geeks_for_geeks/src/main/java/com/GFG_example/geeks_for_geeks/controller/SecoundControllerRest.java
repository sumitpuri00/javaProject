package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SecoundControllerRest {

    DataServiceInterface dataService;
    @Autowired
    public SecoundControllerRest(DataServiceInterface service) {
        this.dataService = service;
    }


    @GetMapping("/showList")
    public List<OrderModel> showAll(){

        return dataService.getAllOrders();
    }
    @GetMapping("/searchOrder/{itemSearch}")
    public List<OrderModel> searchItem(@PathVariable(name = "itemSearch") String search){

        return dataService.searchOrder(search);
    }
    @PostMapping("/addOne")
    public Long addOne(@RequestBody OrderModel objectData){
        return dataService.addOne(objectData);
    }
    @GetMapping("/getById/{id}")
    public OrderModel getById(@PathVariable(name ="id") long productId) {
        return dataService.getById(productId);
    }
    @GetMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable(name ="id") long Id) {
        return dataService.deleteOne(Id);
    }
    @PutMapping("/update/{id}")
    public OrderModel update(@RequestBody OrderModel orderModel,
                                 @PathVariable(name ="id") long productId) {
        return dataService.update(orderModel,productId);
    }


}
