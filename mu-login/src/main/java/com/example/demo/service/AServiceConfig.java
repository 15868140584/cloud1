package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AServiceConfig {

    @Bean
    public DemoService demoService(){
        return new DemoServiceImpl();
    }

}
