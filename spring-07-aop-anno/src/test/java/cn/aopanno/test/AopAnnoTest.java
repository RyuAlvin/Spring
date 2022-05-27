package cn.aopanno.test;

import cn.aopanno.config.SpringConfig;
import cn.aopanno.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopAnnoTest {

    @Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = context.getBean(UserService.class);
        double result = bean.add(8, 4);
        System.out.println(result);
    }
}
