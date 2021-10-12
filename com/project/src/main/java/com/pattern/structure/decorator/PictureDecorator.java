package com.pattern.structure.decorator;

public class PictureDecorator extends Decorator {

    public PictureDecorator(BasePaint paint) {
        super(paint);
    }

    private void method() {
        System.out.println("修饰1");
    }

    @Override
    public void display() {
        this.method();
        super.display();
    }

}
