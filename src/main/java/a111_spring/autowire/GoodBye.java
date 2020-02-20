package a111_spring.autowire;

import org.springframework.stereotype.Component;

@Component
//@CustomQualifier("Bar")
public class GoodBye implements Greetings {

    public void pleaseTellMeSomething() {
        System.out.println("Ok GoodBye Pall!");
    }
}
