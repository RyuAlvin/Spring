package cn.aop.test;

import cn.aop.method1.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMethod2Test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-method2.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
