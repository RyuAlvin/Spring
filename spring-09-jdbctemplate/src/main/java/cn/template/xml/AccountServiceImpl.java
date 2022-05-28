package cn.template.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transfer() {
        userDao.reduceMoney();
        int i = 10 / 0;
        userDao.addMoney();
    }
}
