package cn.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUser() {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    @Override
    public User getUser(int id) {
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        return user;
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set name = ? where id = ?";
        int result = jdbcTemplate.update(sql, user.getName(), user.getId());
        return result;
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from user where id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(id,name,pwd) values(?, ?, ?)";
        int result = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getPwd());
        return result;
    }

    @Override
    public int[] batchAdd(List<Object[]> objArr) {
        String sql = "insert into user(id,name,pwd) values(?, ?, ?)";
        int[] results = jdbcTemplate.batchUpdate(sql, objArr);
        return results;
    }

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
