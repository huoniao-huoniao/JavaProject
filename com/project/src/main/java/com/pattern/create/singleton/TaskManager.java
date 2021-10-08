package com.pattern.create.singleton;

//任务管理器
public class TaskManager {

    private static TaskManager tm = null;

    private TaskManager() {

    }

    // 显示进程
    public void displayProcess() {

    }

    // 显示服务
    public void displayServices() {

    }

    public static TaskManager GetInstance() {
        if (tm == null)
            return new TaskManager();
        return tm;
    }

}