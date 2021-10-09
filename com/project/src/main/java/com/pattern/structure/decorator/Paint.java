package com.pattern.structure.decorator;

public abstract class Paint {
    private String paintName;

    public Paint() {
    }

    public abstract void display();

    public void GetName() {
        System.out.println(this.paintName);
    }

    public void setName(String name) {
        this.paintName = name;
    }
}
