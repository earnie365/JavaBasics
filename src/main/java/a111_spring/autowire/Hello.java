package a111_spring.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("someRandomName")
//@Primary
//@CustomQualifier("hello")
public class Hello implements Greetings {

    @Override
    public void pleaseTellMeSomething() {
        System.out.println("Well, Hello there");
    }
}
