package practice;

public class Child extends Parent {
    public int i = 15;      // 필드 오버라이딩
    public void printI() {      // 메소드 오버라이딩
        System.out.println("child - printI(): " + i);
    }
}
