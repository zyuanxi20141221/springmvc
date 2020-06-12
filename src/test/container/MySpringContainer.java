package test.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringContainer {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        MyServiceImpl myService = context.getBean("myService", MyServiceImpl.class);
        System.out.println(myService.sayHello());
    }
}
