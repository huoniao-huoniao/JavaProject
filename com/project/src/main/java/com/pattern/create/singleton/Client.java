package com.pattern.create.singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer load1, load2, load3;

        load1 = LoadBalancer.GetInstance();
        load2 = LoadBalancer.GetInstance();
        load3 = LoadBalancer.GetInstance();

        if (load1 == load2 && load1 == load3 && load2 == load3) {
            System.out.println("服务器均衡器具有唯一性!");
        }

        load1.Add("server1");
        load2.Add("server2");
        load3.Add("server3");
        load1.Add("server4");
        load1.Add("server5");

        while (true) {
            String serverRandom = load1.GetServer();
            System.out.println("分发至服务器:" + serverRandom);
            if (serverRandom.equals("server4"))
                break;
        }
    }
}
