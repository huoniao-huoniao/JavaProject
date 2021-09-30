package JavaProject.com.liubb.action.abstractFactory;

public class SpringFactory implements IAbstractFactory {

    @Override
    public IBarControl creatBarControl() {
        return new SpringBar();
    }

    @Override
    public ITextControl creatTextControl() {
        return new SpringText();
    }

}
