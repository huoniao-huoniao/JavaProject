package com.pattern.structure.decorator;

public abstract class BasePaint {
    private String paintName;

    public BasePaint() {
    }

    public abstract void display();

    public void getName() {
        System.out.println(this.paintName);
    }

    public void setName(String name) {
        this.paintName = name;
    }
}
