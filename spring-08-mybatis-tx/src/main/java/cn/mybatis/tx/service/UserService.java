package cn.mybatis.tx.service;

import cn.mybatis.tx.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void transfer();
}
