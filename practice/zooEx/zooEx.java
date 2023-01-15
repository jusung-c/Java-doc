package practice.zooEx;

public class zooEx {
    public static void main(String[] args) {
        AnimalGroup cats = new AnimalGroup();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        AnimalGroup dogs = new AnimalGroup();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        AnimalGroup zoo = new AnimalGroup();
        zoo.add(cats);
        zoo.add(dogs);

        zoo.speak();
    }
}
