package practice;

import java.util.ArrayList;
import java.util.List;

public class CompositeExam2 {
    public static void main(String[] args) {
        AnimalGroup cats = new AnimalGroup();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        AnimalGroup dogs = new AnimalGroup();
        dogs.add(new Dog());
        dogs.add(new Dog());

        AnimalGroup zoo = new AnimalGroup();
        zoo.add(cats);
        zoo.add(dogs);

        zoo.speak();

    }
}

interface Animal {
    public void speak();
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("야옹");
    }
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}

class AnimalGroup implements Animal {
    List<Animal> animals = new ArrayList<Animal>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void remove(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void speak() {
        System.out.println("AnimalGroup speaking...");
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
