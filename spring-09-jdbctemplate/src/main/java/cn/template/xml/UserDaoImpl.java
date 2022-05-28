package cn.template.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update account set money=money-100 where id=1";
        jdbcTemplate.update(sql);
    }

    @Override
    public void addMoney() {
        String sql = "update account set money=money+100 where id=2";
        jdbcTemplate.update(sql);
    }
}
