package designmodel.createmodel.factory;

public class Client {
    public static void main(String[] args) {
        ILoggerFactory factory = new FileLoggerFactory();
        ILogger fileLog = factory.createLogger();
        fileLog.write("123");
    }
}
