package com.pattern.structure.proxy.dynamicproxy;

public class UserDao implements ImpleUserDao {

    @Override
    public void findUserById(String userId) {
        System.out.println("查找UserId:" + userId + "的用户");
    }

}
