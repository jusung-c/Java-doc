package practice.cake;

public class RoundSheet extends Sheet{

    RoundSheet(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public String decorate() {
        return "둥근 " + super.decorate();
    }
}
