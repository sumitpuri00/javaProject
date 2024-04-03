package com.GFG_example.geeks_for_geeks.service;

import com.GFG_example.geeks_for_geeks.database.DAO;
import com.GFG_example.geeks_for_geeks.interfaces.ServiceDataAccessInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class   DataService  implements ServiceDataAccessInterface {
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

    @Override
    public OrderModel getById(long productId) {
        return dao.getById(productId);
    }

    @Override
    public List<OrderModel> OrderList() {
        return null;
    }

    @Override
    public List<OrderModel> searchOrder(String search) {
        return dao.searchOrder(search);
    }

    @Override
    public long addOne(OrderModel add) {
        return dao.addOne(add);
    }

    @Override
    public boolean deleteOne(long id) {
        return dao.deleteOne(id);
    }

    @Override
    public OrderModel update(OrderModel update, long id) {
        return dao.update(update,id);
    }
}
