package cn.mybatis.tx.dao;

import cn.mybatis.tx.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
}
