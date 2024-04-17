package com.GFG_example.geeks_for_geeks.servicesDatabase;

import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import com.GFG_example.geeks_for_geeks.model.OrderModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//@Primary
//@Repository
public class DAO implements DataServiceInterface {
//    why we are putting the cann data inside the constructor? find it ..
    List<OrderModel>orderList=new ArrayList<OrderModel>();

    public DAO() {
                orderList.add(new OrderModel(1,"N5J55lJ","this is vanya data",2,85.85f));
                orderList.add(new OrderModel(2,"685JD7DJ","asta",5,6444.85f));
                orderList.add(new OrderModel(3,"J66IR6NDI","eren",7,78905));
                orderList.add(new OrderModel(4,"5H84HE8","zoro",2,6775.85f));
                orderList.add(new OrderModel(5,"NI8R84","cid",5,7458.85f));
                orderList.add(new OrderModel(6,"NRI5J55","alpha",8,8665.85f));
                orderList.add(new OrderModel(7,"9K885955","beta",1,8666.85f));
    }


    @Override
    public List<OrderModel> getAllOrders() {
        return orderList;
    }


    @Override
    public OrderModel getById(long productId) {
        for(OrderModel orderModel :orderList){
            if (orderModel.getId()==productId){
                return orderModel;
            }
        }
        List<OrderModel>m= Arrays.asList(new OrderModel(0,"nulll","no Product",000,00));
        return m.get(0);
    }
    @Override
    public List<OrderModel> searchOrder(String search) {
        List<OrderModel>searchList=new ArrayList<>();
        for (OrderModel orderModel : orderList) {
            if (orderModel.getProductName().toLowerCase().contains(search.toLowerCase())) {
                searchList.add(orderModel);
            }
        }
//        Do it with stream too;
        return searchList;
    }

    @Override
    public long addOne(OrderModel add) {
        if (orderList.add(add)){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean deleteOne(long id) {

        for(OrderModel orderModel :orderList){
            if (orderModel.getId()==id){
                 orderList.remove(orderModel);
                 return true;
            }
        }
        return false;
    }

    @Override
    public OrderModel update(OrderModel update, long id) {
        for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getId()==id){
                    orderList.set(i,update);
                    return orderList.get(1);
                }
        }
        return null;
    }

}
