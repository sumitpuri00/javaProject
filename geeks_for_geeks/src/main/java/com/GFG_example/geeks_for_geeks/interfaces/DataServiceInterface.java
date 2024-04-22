package com.GFG_example.geeks_for_geeks.interfaces;

import com.GFG_example.geeks_for_geeks.model.OrderModel;

import java.util.List;

public interface DataServiceInterface<T> {


//    String print();
//    void init();
//    void destroy();
    public List<T> getAllOrders();
    public T getById(long productId);
    public List<T> searchOrder(String search);
    //    why addOne methods return type is long?
    public long addOne(T add);
    public boolean deleteOne(long id);
    public T update(T update,long id);


}
