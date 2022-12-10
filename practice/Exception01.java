package practice;

public class Exception01 {
    public static void main(String[] args) {
        try {
            ExceptionObj eobj = new ExceptionObj();
            int value = eobj.divide(10, 0);
            System.out.println(value);
        } catch (MyException me) {
            System.out.println("사용자 정의 익셉션 발생");
        }
    }
}

class ExceptionObj {
    public int divide(int i, int k) throws MyException {
        int value = 0;
        try {
            value = i / k;
        } catch (ArithmeticException arithmeticException) {
            throw new MyException("0으로 나눌 수 없습니다.");
        }
        return value;
    }
}