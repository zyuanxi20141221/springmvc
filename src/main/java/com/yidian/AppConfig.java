package com.yidian;

import com.yidian.model.Friend;
import com.yidian.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("test.container")
public class AppConfig {

    @Bean
    public Friend friend() {
        Friend friend = new Friend();
        friend.setName("Jenny");
        return friend;
    }

    @Bean(initMethod = "init", destroyMethod = "clearup")
    @Primary
    public Person aPerson() {
        Person person = new Person();
        person.setName("Jimmy Zheng");
        return person;
    }

    @Bean(initMethod = "init", destroyMethod = "clearup")
    public Person bPerson() {
        Person person = new Person();
        person.setName("John");
        return person;
    }

    @Bean
    public MyServiceImpl myService() {
        MyServiceImpl service = new MyServiceImpl();
        service.setGreeting("Hello 你好");
        return service;
    }
}
