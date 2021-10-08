package com.pattern.create.abstractFactory;

public interface IAbstractFactory {

    IBarControl creatBarControl();

    ITextControl creatTextControl();
}
