package practice;

// Component
interface CakeComponent {
    public void status();
}

// 주인공
class CakeConcreteComponent implements CakeComponent {
    @Override
    public void status() {
        System.out.println("CakeConcreteComponent");
    }
}

// 데코레이터
abstract class CakeComponentDecorator implements CakeComponent {
    private final CakeComponent cakeComponent;

    CakeComponentDecorator(CakeComponent cakeComponent) {
        this.cakeComponent = cakeComponent;
    }

    @Override
    public void status() {
        System.out.println("케이크 장식 시작!");
    }
}

// 데코레이터 - 시트
abstract class Sheet extends CakeComponentDecorator {
    Sheet(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("시트 데코레이터");
    }
}

// 데코레이터 - 크림
abstract class Cream extends CakeComponentDecorator {
    Cream(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("크림 데코레이터");
    }
}

// 데코레이터 - 시트 - 동그라미
class RoundSheet extends Sheet{
    RoundSheet(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("동그라미 시트 생성");
    }
}

// 데코레이터 - 시트 - 네모
class RecSheet extends Sheet{
    RecSheet(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("네모 시트 생성");
    }
}

// 데코레이터 - 크림 - 초코
class Choco extends Cream{
    Choco(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("초코 크림 바르기");
    }
}

// 데코레이터 - 크림 - 딸기
class Strawberry extends Cream{
    Strawberry(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("딸기 크림 바르기");
    }
}

public class DecoratorExam {
    public static void main(String[] args) {
        // 초코 네모 케이크
        CakeComponent cake1 = new Choco(new RecSheet(new CakeConcreteComponent()));
        cake1.status();

    }
}