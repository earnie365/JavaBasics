package a111_spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TalkService {

    @Autowired
    @Qualifier("someRandomName")
//    @CustomQualifier("Foo")
    private Greetings formatter;

    public void doStuff() {
        formatter.pleaseTellMeSomething();
    }

}
