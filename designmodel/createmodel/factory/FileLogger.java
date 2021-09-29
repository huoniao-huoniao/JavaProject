package designmodel.createmodel.factory;

public class FileLogger implements ILogger {

    @Override
    public void write(String message) {
        System.out.println("文件日志:" + message);
    }

}
