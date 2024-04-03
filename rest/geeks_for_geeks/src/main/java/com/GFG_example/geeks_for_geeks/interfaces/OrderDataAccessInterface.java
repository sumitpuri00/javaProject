package com.GFG_example.geeks_for_geeks.interfaces;

import com.GFG_example.geeks_for_geeks.model.OrderModel;

import java.util.List;

public interface OrderDataAccessInterface {

    OrderModel getById(long productId);

    List<OrderModel> getAllOrders();
    List<OrderModel> searchOrder(String search);
//    why addOne methods return type is long?
    long addOne(OrderModel add);
    boolean deleteOne(long id);
    OrderModel update(OrderModel update,long id);
}
