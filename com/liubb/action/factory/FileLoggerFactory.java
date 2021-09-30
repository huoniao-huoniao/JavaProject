package JavaProject.com.liubb.action.factory;

public class FileLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }

}
