package designmodel.createmodel.abstractFactory;

public interface IAbstractFactory {

    IBarControl creatBarControl();

    ITextControl creatTextControl();
}
