package com.GFG_example.geeks_for_geeks.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
//this class will connect our SQLtable to our orderModel;
//this class work as a bridge that connect the table name with the variable name in our orderModel;

public class OrderMapper implements RowMapper<OrderModel> {
    @Override
    public OrderModel mapRow(ResultSet rs, int rowNum) throws SQLException {
//        so ,what we going to do is take something that comes from the DB and converts it into the orderModel;
//        rs means resultSet;
        OrderModel orders=new OrderModel(
                rs.getLong("ID"),
                rs.getString("ORDER_NUMBER"),
                rs.getString("PRODUCT_NAME"),
                rs.getInt("PRICE"),
                rs.getFloat("QTY") );
        return orders;
    }
}
