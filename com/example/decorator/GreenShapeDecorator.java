package com.example.decorator;

public class GreenShapeDecorator extends ShapeDecorator {

    public GreenShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Green ============ Start");
        decoratorShape.draw();
        System.out.println("Green ============ Start");
    }
}
