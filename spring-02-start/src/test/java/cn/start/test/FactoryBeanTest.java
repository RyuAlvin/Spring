package cn.start.test;

import cn.start.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-bean.xml");
        User user = context.getBean("myFactoryBean", User.class);
        System.out.println(user);
    }
}
