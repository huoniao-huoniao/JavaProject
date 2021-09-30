package JavaProject.com.liubb.action.abstractFactory;

public class SummerFactory implements IAbstractFactory {

    @Override
    public IBarControl creatBarControl() {
        return new SummerBar();
    }

    @Override
    public ITextControl creatTextControl() {
        return new SummerText();
    }

}
