package com.GFG_example.geeks_for_geeks;

import com.GFG_example.geeks_for_geeks.servicesDatabase.DAO;
import com.GFG_example.geeks_for_geeks.servicesDatabase.OrderDataServiceSQL;
import com.GFG_example.geeks_for_geeks.interfaces.DAOInterface;
import com.GFG_example.geeks_for_geeks.interfaces.DataServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
   @Bean(name = "dao")
    public DataServiceInterface firstBean(){
       return new DAO();
   }

    @Bean(name = "daoSecond")
    public DAOInterface secondBean(){
        return new OrderDataServiceSQL();
    }


}
