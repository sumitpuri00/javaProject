package com.GFG_example.geeks_for_geeks;

import com.GFG_example.geeks_for_geeks.model.OrderModel;
import com.GFG_example.geeks_for_geeks.servicesDatabase.DAO;
import com.GFG_example.geeks_for_geeks.servicesDatabase.OrderDataServiceForCRUD;
import com.GFG_example.geeks_for_geeks.servicesDatabase.OrderDataServiceSQL;
import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
   @Bean(name = "dao")
    public DataServiceInterface firstBean(){
       return new DAO();
   }

   @Autowired
    DataSource dataSource;
    @Bean(name = "daoSecond")
    public DAOInterface secondBean(){
        return new OrderDataServiceSQL();
//        return new OrderDataServiceForCRUD(dataSource);
    }

//    @Bean(name = "orderModel")
//    public OrderModel secondBean(){
//        return new OrderModel();
//    }


}
