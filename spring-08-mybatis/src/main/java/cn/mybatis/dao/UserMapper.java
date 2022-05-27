package cn.mybatis.dao;

import cn.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
}
