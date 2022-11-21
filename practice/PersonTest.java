package practice;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(Person.count);
        Person.count++;
        System.out.println(Person.count);
        System.out.println(p1.count);

    }
}
