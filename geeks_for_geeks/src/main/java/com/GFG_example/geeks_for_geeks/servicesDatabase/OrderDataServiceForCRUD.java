package com.GFG_example.geeks_for_geeks.servicesDatabase;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.RepositaryCRUDInterface;
import com.GFG_example.geeks_for_geeks.model.EntityModel;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class OrderDataServiceForCRUD implements DAOInterface<OrderModel> {

    @Autowired
    RepositaryCRUDInterface crudRepositary;

    private JdbcTemplate jdbcTemplate;

    public OrderDataServiceForCRUD(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<OrderModel> getAllOrders() {
        return List.of();
    }

    @Override
    public OrderModel getById(long productId) {
        EntityModel sumit=crudRepositary.findById(productId).orElse(null);
//      here we have done model mapping, mapping with orderModel to  EntityModel;
        OrderModel result=new OrderModel(sumit.getId(),sumit.getOrderNo(),sumit.getProductName(),sumit.getQuantity(),sumit.getPrice());
        return result;
    }

    @Override
    public List<OrderModel> searchOrder(String search) {
        return List.of();
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
