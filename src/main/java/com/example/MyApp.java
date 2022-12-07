package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = applicationContext.getBean("RandomTextMessageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("RandomTextMessageService", MessageService.class);


        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());

        System.out.println(messageService.getMessage());
    }
}
