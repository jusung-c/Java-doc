package practice.cake;

public class RecSheet extends Sheet{

    RecSheet(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public String decorate() {
        return "네모 " + super.decorate();
    }
}
