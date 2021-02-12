package com.lzh.config;

import com.lzh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.lzh.pojo")
@Import(Appconfig2.class)

public class Appconfig {
    @Bean
    public User getUser(){
        return new User() ;
    }

}
