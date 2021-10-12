package com.pattern.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ImpleUserDao dao = new UserDao();
        InvocationHandler handler = new DaoLogHandle(dao);
        ImpleUserDao proxy = (ImpleUserDao) Proxy.newProxyInstance(ImpleUserDao.class.getClassLoader(),
                new Class[] { ImpleUserDao.class }, handler);
        proxy.findUserById("liubb");
    }
}
