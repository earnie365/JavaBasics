package a111_spring.inject;

import javax.inject.Named;

@Named
public class Cat {

    public void mheow() {
        System.out.println("Cat says get the f*ck my mouse");
    }
}
