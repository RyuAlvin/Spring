package cn.autowired.test;

import cn.autowired.anno.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestAnno {

    @Test
    public void test01() {
        ApplicationContext contextAnno = new ClassPathXmlApplicationContext("beans-anno.xml");
        User user = (User) contextAnno.getBean("user");
        user.getCat().sayHi();
        user.getDog().sayHi();
    }
}
