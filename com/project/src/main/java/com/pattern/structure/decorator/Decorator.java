package com.pattern.structure.decorator;

/**
 * @apiNote 抽象类 实现 抽象
 */
public abstract class Decorator extends BasePaint {

    private BasePaint basePaint = null;

    public Decorator(BasePaint paint) {
        this.basePaint = paint;
    }

    @Override
    public void display() {
        basePaint.display();
    }

}
