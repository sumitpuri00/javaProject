package com.GFG_example.geeks_for_geeks.interfaces;

import com.GFG_example.geeks_for_geeks.model.OrderModel;

import java.util.List;

public interface ServiceInterface {
    List<OrderModel> orderList();
    String print();
    void init();
    void destroy();


}
