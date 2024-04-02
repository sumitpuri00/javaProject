package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import com.GFG_example.geeks_for_geeks.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    ServiceInterface service;
    @Autowired
    public OrderController(ServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/showAll")
    public String showAll(Model model){


        model.addAttribute("title","List of all orders by sum it");
        model.addAttribute("modelOrder",service.orderList());


        return "i";
    }

}
