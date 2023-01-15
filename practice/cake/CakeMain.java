package practice.cake;

public class CakeMain {
    public static void main(String[] args) {
        // 버터 둥근 케이크
        CakeComponent c1 = new ButterCream(new RoundSheet(new CakeConcreteComponent()));
        String s1 = c1.decorate();
        System.out.println(s1);

        // 네모 초코 케이크
        CakeComponent c2 = new RecSheet(new ChocoCream(new CakeConcreteComponent()));
        String s2 = c2.decorate();
        System.out.println(s2);

        CakeComponent c3 = new ChocoCream(new ChocoCream(new ChocoCream(new CakeConcreteComponent())));
        String s3 = c3.decorate();
        System.out.println(s3);

    }
}
