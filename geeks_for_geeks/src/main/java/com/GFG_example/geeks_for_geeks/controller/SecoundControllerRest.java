package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v")
public class SecoundControllerRest {
    ServiceInterface service;
    @Autowired
    public SecoundControllerRest(ServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<OrderModel> showAll(){

        return service.orderList();
    }

}
