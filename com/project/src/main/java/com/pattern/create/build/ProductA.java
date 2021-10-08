package com.pattern.create.build;

public class ProductA implements IProduct {

    private String partA;

    private String partB;

    private String partC;

    @Override
    public void partA() {
        this.partA = "partA";
    }

    @Override
    public void partB() {
        this.partB = "partB";
    }

    @Override
    public void partC() {
        this.partC = "partC";
    }

    public String getPartA() {
        return this.partA;
    }

    public String getPartB() {
        return this.partB;
    }

    public String getPartC() {
        return this.partC;
    }

}
