package com.GFG_example.geeks_for_geeks.servicesDatabase;

import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.model.OrderMapper;
import com.GFG_example.geeks_for_geeks.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDataServiceSQL implements DAOInterface {
//    this is for the connection with the database through the property we have defined in application property file;
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public OrderModel getById(long productId) {
        List<OrderModel> result=jdbcTemplate.query("SELECT * FROM orders WHERE ID=?",new OrderMapper(),productId);
        if (result.size()>0){
            return result.get(0);
        }else {
            return null;
        }

    }

    @Override
    public List<OrderModel> getAllOrders() {
        List<OrderModel> result=jdbcTemplate.query("SELECT  * FROM database1.orders",new OrderMapper());
        return result;
    }

    @Override
    public List<OrderModel> searchOrder(String search) {
        List<OrderModel>result=jdbcTemplate.query("SELECT * FROM orders WHERE PRODUCT_NAME LIKE ?",new OrderMapper(),"%"+search+"%");
        return result;
    }

    @Override
    public long addOne(OrderModel add) {
//        long addOnee =jdbcTemplate.update("INSERT INTO ORDERS (ORDER_NUMBER,PRODUCT_NAME,PRICE,QTY) VALUES(?,?,?,?)",
//                add.getOrderNo(),
//                add.getProductName(),
//                add.getPrice(),
//                add.getQuantity());
//        return addOnee;

//        with simple JDBCInsert because it has a inbuild method which return the id in what data is inserted;
        SimpleJdbcInsert simpleJdbcInsert=new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName("orders").usingGeneratedKeyColumns("ID");

        Map<String,Object> mapParameter=new HashMap<String,Object>();
        mapParameter.put("ORDER_NUMBER",add.getOrderNo());
        mapParameter.put("PRODUCT_NAME",add.getProductName());
        mapParameter.put("PRICE",add.getPrice());
        mapParameter.put("QTY",add.getQuantity());

        Number result=simpleJdbcInsert.executeAndReturnKey(mapParameter);

        return result.longValue();
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
