package designmodel.createmodel.factory;

public class DbLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new DbLogger();
    }

}
