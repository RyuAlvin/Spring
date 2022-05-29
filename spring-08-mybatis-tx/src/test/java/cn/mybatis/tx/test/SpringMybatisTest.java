package cn.mybatis.tx.test;

import cn.mybatis.tx.config.SpringMybatisConfig;
import cn.mybatis.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMybatisTest {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringMybatisConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.transfer();
    }
}
