package practice.zooEx;

import java.util.ArrayList;
import java.util.List;

public class AnimalGroup implements Animal {
    List<Animal> animals = new ArrayList<Animal>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void remove(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void speak() {
        System.out.println("Group speaking...");
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
