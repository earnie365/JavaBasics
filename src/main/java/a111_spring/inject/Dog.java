package a111_spring.inject;

import javax.inject.Named;

@Named
public class Dog {

    public void bark() {
        System.out.println("Dog says whoof whoof");
    }
}
