package com.framework.core.springmvc.config;

import com.framework.core.springmvc.service.AccountService;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import com.framework.core.springmvc.Constants;

@Configuration
@ComponentScan(
    basePackageClasses = {Constants.class},
    excludeFilters = {
        @Filter(
            type = FilterType.ANNOTATION,
            value = {
                RestController.class,
                ControllerAdvice.class,
                Configuration.class
            }
        )
    }
)
@PropertySource("classpath:/app.properties")
@PropertySource(value = "classpath:/database.properties", ignoreResourceNotFound = true)
public class AppConfig {



    /*@Bean
    public UserDetailsService accountUserDetails(){
        return new UserDetailServiceImpl();
    }*/


}
