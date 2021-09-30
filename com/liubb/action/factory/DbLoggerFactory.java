package JavaProject.com.liubb.action.factory;

public class DbLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new DbLogger();
    }

}
