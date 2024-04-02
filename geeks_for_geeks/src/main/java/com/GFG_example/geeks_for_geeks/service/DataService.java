package com.GFG_example.geeks_for_geeks.service;

import com.GFG_example.geeks_for_geeks.database.DAO;
import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

public class   DataService  implements ServiceInterface {
    @Autowired
    DAO dao;
    @Override
    public List<OrderModel> orderList() {

        return dao.getAllOrders();
    }

    @Override
    public String print() {
        return "this is print inside service class";
    }
    @Override
    public void init() {
        System.out.println("postService init method");
    }

    @Override
    public void destroy() {
        System.out.println("postService destroy method");
    }
}
