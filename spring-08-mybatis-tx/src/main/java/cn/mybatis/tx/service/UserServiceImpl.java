package cn.mybatis.tx.service;

import cn.mybatis.tx.dao.AccountDao;
import cn.mybatis.tx.dao.UserDao;
import cn.mybatis.tx.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<User> getAllUser() {
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        return userDao.getAllUser();
    }

    @Override
    public void transfer() {
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        accountDao.reduceMoney();
//        int i = 10 / 0;
        accountDao.addMoney();
    }
}
