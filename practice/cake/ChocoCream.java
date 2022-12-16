package practice.cake;

public class ChocoCream extends Cream{

    ChocoCream(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public String decorate() {
        return "초코 " + super.decorate();
    }
}
