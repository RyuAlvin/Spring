package cn.mybatis.test;

import cn.mybatis.dao.UserMapper;
import cn.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {

    @Test
    public void test01() {
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getAllUser().forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Mybatis-Spring.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        mapper.getAllUser().forEach(System.out::println);
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Mybatis-Spring.xml");
        UserMapper userDao = (UserMapper) context.getBean("userDao");
        userDao.getAllUser().forEach(System.out::println);
    }
}
