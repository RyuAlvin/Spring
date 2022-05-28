package cn.template;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getUser(int id);

    int updateUser(User user);

    int deleteUser(int id);

    int addUser(User user);

    int[] batchAdd(List<Object[]> objArr);

    void reduceMoney();

    void addMoney();
}
