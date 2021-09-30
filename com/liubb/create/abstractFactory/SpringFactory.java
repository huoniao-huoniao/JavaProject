package JavaProject.com.liubb.create.abstractFactory;

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
