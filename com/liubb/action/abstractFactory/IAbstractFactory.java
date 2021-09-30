package JavaProject.com.liubb.action.abstractFactory;

public interface IAbstractFactory {

    IBarControl creatBarControl();

    ITextControl creatTextControl();
}
