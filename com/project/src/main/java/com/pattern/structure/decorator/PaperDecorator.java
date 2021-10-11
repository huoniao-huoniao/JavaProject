package com.pattern.structure.decorator;

public class PaperDecorator extends Decorator {

    public PaperDecorator(BasePaint paint) {
        super(paint);
    }

    private void method() {
        System.out.println("修饰2");
    }

    @Override
    public void display() {
        this.method();
        super.display();
    }
}
