package com.pattern.create.abstractFactory;

public class Client {
    public static void main(String[] args) {

        IAbstractFactory springControl = new SpringFactory();
        springControl.creatBarControl().showBar();
        springControl.creatTextControl().showText();
    }
}
