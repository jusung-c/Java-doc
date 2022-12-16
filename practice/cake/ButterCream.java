package practice.cake;

public class ButterCream extends Cream{

    ButterCream(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public String decorate() {
        return "버터 " + super.decorate();
    }
}
