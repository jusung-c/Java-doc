package com.example.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Red ============ Start");
        decoratorShape.draw();
        System.out.println("Red ============ Start");
    }
}
