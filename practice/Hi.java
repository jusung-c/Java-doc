package practice;

public class Hi {
    public static void main(String[] args) {
        Car c1 = new Car() {
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        };

        c1.a();
    }
}
