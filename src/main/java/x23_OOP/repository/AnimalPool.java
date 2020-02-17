package x23_OOP.repository;


import x23_OOP.animaLinterface.Animal;
import x23_OOP.animalTypes.Elephant;
import x23_OOP.animalTypes.Tiger;
import x23_OOP.animalTypes.Wolf;
import x23_OOP.animalTypes.Zebra;
import x23_OOP.itarator.Aggregate;
import x23_OOP.itarator.Iterator;

public class AnimalPool implements Aggregate {

    private Animal animals[] = {new Zebra(), new Elephant(), new Tiger(), new Wolf()};

    @Override
    public Iterator getIterator() {
        return new AnimalIterator();
    }


    private class AnimalIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < animals.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return animals[index++];
        }
    }
}