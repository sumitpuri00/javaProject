package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/puri")
public class WebController {
    @Autowired
    DataServiceInterface orderModelClass;

    @Autowired
    DAOInterface orderModelClassTwo;

    @GetMapping("/table1")
    public String htmlPage(Model model){
        model.addAttribute("modelOrder",orderModelClass.getAllOrders());
        return "i";
    }

    @GetMapping("/table2")
    public String htmlPage1(Model model){
        model.addAttribute("modelOrder",orderModelClassTwo.getAllOrders());
        return "i";
    }
}
