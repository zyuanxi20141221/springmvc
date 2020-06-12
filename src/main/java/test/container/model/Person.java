package test.container.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name;
    private Friend friend;

    public void init() {
        System.out.println("person init");
    }

    public void clearup() {
        System.out.println("person clearup");
    }

    public Friend getFriend() {
        return friend;
    }

    @Autowired
    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
