package com.yidian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringContainer {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.save();
    }
}
