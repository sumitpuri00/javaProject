package com.GFG_example.geeks_for_geeks.service;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

public class PostService implements ServiceInterface {
    @Override
    public List<OrderModel> orderList() {
        List<OrderModel> orderListt = Arrays.asList(
                new OrderModel(1,"8J5HJ5NN5J55lJ","pen drive",2,85.85f),
                new OrderModel(2,"7JRI5JDJ685JD7DJ","computer",5,6444.85f),
                new OrderModel(3,"8R59JD5NJ66IR6NDI","laptop",7,78905),
                new OrderModel(4,"85H8G875H84HE8","fan",2,6775.85f),
                new OrderModel(5,"8845NI6DNI8R84","mobile",5,7458.85f),
                new OrderModel(6,"745JSD8NRI5J55","PC",8,8665.85f),
                new OrderModel(7,"I4EKI6EI9K885955","apple",1,8666.85f)
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
