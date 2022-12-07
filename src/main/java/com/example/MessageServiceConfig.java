package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MessageServiceConfig {
    @Bean
    public RandomTextMessageService RandomTextMessageService(){
        return new RandomTextMessageService();
    }
    @Bean
    public MyNameMessageService MyNameMessageService(){
        return new MyNameMessageService();
    }
}
