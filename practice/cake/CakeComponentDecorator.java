package practice.cake;

abstract class CakeComponentDecorator implements CakeComponent {
    private final CakeComponent cakeComponent;

    CakeComponentDecorator(CakeComponent cakeComponent) {
        this.cakeComponent = cakeComponent;
    }

    @Override
    public String decorate() {
        return cakeComponent.decorate();
    }

}
