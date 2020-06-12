package test.container;

import org.springframework.beans.factory.annotation.Autowired;
import test.container.model.Person;

public class MyServiceImpl implements MyService {

    private Person person;
    private String greeting;

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }


    @Override
    public String sayHello() {
        return this.greeting + " " + this.person.getName() + " friend:" + person.getFriend().getName();
    }
}
