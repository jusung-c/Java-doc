package practice;

public class Exception01 {
    public static void main(String[] args) {
        ExceptionObj1 exobj1 = new ExceptionObj1();
        int value = exobj1.divide(10, 0);
        System.out.println(value);
    }
}

class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = i / k;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없어요");
            System.out.println(e.toString());
        }
        return value;
    }
}
