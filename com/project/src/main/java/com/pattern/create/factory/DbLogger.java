package JavaProject.com.liubb.create.factory;

public class DbLogger implements ILogger {

    @Override
    public void write(String message) {
        System.out.println("数据库日志:" + message);
    }

}
