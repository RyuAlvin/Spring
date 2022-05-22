package cn.anno.test;

import cn.anno.config.MyConfig;
import cn.anno.pojo.Cat;
import cn.anno.pojo.Dog;
import cn.anno.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }

    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getName());
    }

    @Test
    public void test03() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) context.getBean("dog");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}
