package com.example.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(c);

        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(redShapeDecorator);

        greenShapeDecorator.draw();

        Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Rectangle()));
    }
}
