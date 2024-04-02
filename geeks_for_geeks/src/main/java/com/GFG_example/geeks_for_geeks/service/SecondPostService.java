package com.GFG_example.geeks_for_geeks.service;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

public class  SecondPostService implements ServiceInterface {
    @Override
    public List<OrderModel> orderList() {
        List<OrderModel> orderListt = Arrays.asList(
                new OrderModel(11,"N5J55lJ","luffy",2,85.85f),
                new OrderModel(21,"685JD7DJ","asta",5,6444.85f),
                new OrderModel(31,"J66IR6NDI","eren",7,78905),
                new OrderModel(41,"5H84HE8","zoro",2,6775.85f),
                new OrderModel(51,"NI8R84","cid",5,7458.85f),
                new OrderModel(61,"NRI5J55","alpha",8,8665.85f),
                new OrderModel(73,"9K885955","beta",1,8666.85f)
        );
        return orderListt;
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
