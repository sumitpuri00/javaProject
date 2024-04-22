package com.GFG_example.geeks_for_geeks.controller;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import com.GFG_example.geeks_for_geeks.model.SearchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {
    @Autowired
    DataServiceInterface orderModelClass;

    @Autowired
    DAOInterface orderModelClassTwo;

    @GetMapping("/table1")
    public String htmlPage(Model model){
        model.addAttribute("modelOrder",orderModelClass.getAllOrders());
        return "data";
    }

    @GetMapping("/table2")
    public String htmlPage1(Model model){
        model.addAttribute("modelOrder",orderModelClassTwo.getAllOrders());
        return "data";
    }

//    web page mapping
    @GetMapping("/addForm")
    public String formMethod(Model model){
        model.addAttribute("modelObject",new OrderModel());
        return "addForm";
    }
    @PostMapping("/addNewUsingForm")
    public String addOne(@Validated OrderModel orderModel , Model model){
        orderModelClassTwo.addOne(orderModel);
        model.addAttribute("modelOrder",orderModelClassTwo.getAllOrders());
        return "data";
    }

    @GetMapping("/searchForm")
    public String search(Model model){
        model.addAttribute("searchObject",new SearchModel());
        return "searchForm";
    }
    @PostMapping("/searchTerm")
    public String searchYourTerm(SearchModel searchModel, Model model){
        String searchTerm=searchModel.getSearchTerm();
        List<OrderModel>searchList=orderModelClassTwo.searchOrder(searchTerm);
        model.addAttribute("modelOrder",searchList);
        return "searchedData";
    }
}
