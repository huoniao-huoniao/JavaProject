package com.pattern.structure.adapter;

public class AdapterType implements IThree {

    private ITwo two;

    public AdapterType(ITwo two) {
        this.two = two;
    }

    @Override
    public void Three() {
        two.TwoMethod();
    }

}