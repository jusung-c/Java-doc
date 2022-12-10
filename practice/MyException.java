package practice;

public class MyException extends RuntimeException {
    // 문자열 익셉션
    public MyException(String message) {
        super(message);
    }

    // 다른 익셉션
    public MyException(Exception cause) {
        super(cause);
    }
}
