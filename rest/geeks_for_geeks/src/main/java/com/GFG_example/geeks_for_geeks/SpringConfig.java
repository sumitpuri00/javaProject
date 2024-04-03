package com.GFG_example.geeks_for_geeks;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceDataAccessInterface;
import com.GFG_example.geeks_for_geeks.service.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {
    @Bean(name ="services",initMethod ="init",destroyMethod = "destroy")
//    @RequestScope
    @SessionScope
    public ServiceDataAccessInterface whichService(){
        return new DataService();
    }
}
