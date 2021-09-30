package JavaProject.com.liubb.action.factory;

public class FileLogger implements ILogger {

    @Override
    public void write(String message) {
        System.out.println("文件日志:" + message);
    }

}
