package com.pattern.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DaoLogHandle implements InvocationHandler {

    private Object object;

    public DaoLogHandle(Object proxy) {
        this.object = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log();
        method.invoke(object, args);
        end();
        return null;
    }

    public void Log() {
        System.out.println("记录当前时间2021-10-12");
    }

    public void end() {
        System.out.println("结束");
    }

}
