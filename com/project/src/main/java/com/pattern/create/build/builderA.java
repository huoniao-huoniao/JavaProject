package com.pattern.create.build;

public class builderA implements Ibuilder {

    private IProduct _product;

    public builderA(IProduct product) {
        _product = product;
    }

    @Override
    public IProduct getProduct() {

        buildPartA();
        buildPartB();
        buildPartC();
        return _product;
    }

    private void buildPartA() {
        _product.partA();
    }

    private void buildPartB() {
        _product.partB();
    }

    private void buildPartC() {
        _product.partC();
    }

}
