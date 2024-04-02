package com.GFG_example.geeks_for_geeks;

import com.GFG_example.geeks_for_geeks.interfaces.ServiceInterface;
import com.GFG_example.geeks_for_geeks.service.DataService;
import com.GFG_example.geeks_for_geeks.service.PostService;
import com.GFG_example.geeks_for_geeks.service.SecondPostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {
    @Bean(name ="services",initMethod ="init",destroyMethod = "destroy")
//    @RequestScope
    @SessionScope
    public ServiceInterface whichService(){
        return new DataService();
    }
}
