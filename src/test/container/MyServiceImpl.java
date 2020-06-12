package test.container;

public class MyServiceImpl implements MyService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
        return "Hello " + name;
    }
}
