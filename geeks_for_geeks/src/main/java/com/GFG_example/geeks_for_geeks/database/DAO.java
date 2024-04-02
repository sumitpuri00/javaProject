package com.GFG_example.geeks_for_geeks.database;

import com.GFG_example.geeks_for_geeks.interfaces.OrderDataAccessInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class DAO implements OrderDataAccessInterface {
//    why we are putting the cann data inside the constructor? find it ..
    List<OrderModel>orderList=new ArrayList<OrderModel>();

    public DAO() {
                orderList.add(new OrderModel(11,"N5J55lJ","this is cann data",2,85.85f));
                orderList.add(new OrderModel(21,"685JD7DJ","asta",5,6444.85f));
                orderList.add(new OrderModel(31,"J66IR6NDI","eren",7,78905));
                orderList.add(new OrderModel(41,"5H84HE8","zoro",2,6775.85f));
                orderList.add(new OrderModel(51,"NI8R84","cid",5,7458.85f));
                orderList.add(new OrderModel(61,"NRI5J55","alpha",8,8665.85f));
                orderList.add(new OrderModel(73,"9K885955","beta",1,8666.85f));
    }

    @Override
    public OrderModel getById() {
        return null;
    }

    @Override
    public List<OrderModel> getAllOrders() {
        return orderList;
    }

    @Override
    public List<OrderModel> searchOrder(String search) {
        return null;
    }

    @Override
    public long addOne(OrderModel add) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public OrderModel update(OrderModel update, long id) {
        return null;
    }
}
