package JavaProject.com.liubb.action.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author liubb
 * @version 0.1
 */
public class LoadBalancer {

    /**
     * 单例对象实例
     */
    private static LoadBalancer instance = null;

    private List<String> ListServer = null;

    private LoadBalancer() {
        ListServer = new ArrayList<String>();
    }

    public synchronized static LoadBalancer GetInstance() {
        if (instance == null)
            instance = new LoadBalancer();
        return instance;
    }

    public void Add(String server) {
        ListServer.add(server);
    }

    public void Remove(String server) {
        ListServer.remove(server);
    }

    public String GetServer() {
        Random random = new Random();
        int i = random.nextInt(ListServer.size());
        return (String) ListServer.get(i);
    }

}