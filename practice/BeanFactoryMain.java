package practice;

public class BeanFactoryMain {
    public static void main(String[] args) {
        BeanFactory bf1 = BeanFactory.getInstance();

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

    }
}
