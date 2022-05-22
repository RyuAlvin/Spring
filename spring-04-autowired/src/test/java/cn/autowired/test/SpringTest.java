package cn.autowired.test;

import cn.autowired.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.getCat().sayHi();
        user.getDog().sayHi();
    }

    @Test
    public void test02() {
        // 报错，java.lang.NullPointerException
        // 因为此时在user里找不到对应catXXX的属性
        ApplicationContext contextByName = new ClassPathXmlApplicationContext("beans-byName.xml");
        User user = (User) contextByName.getBean("user");
        user.getCat().sayHi();
        user.getDog().sayHi();
    }

    @Test
    public void test03() {
        // 报错，nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException
        // 因为是按类型匹配cat，但此时，容器中的cat类型组件不唯一，无法自动装配，会报异常
        ApplicationContext contextByType = new ClassPathXmlApplicationContext("beans-byType.xml");
        User user = (User) contextByType.getBean("user");
        user.getCat().sayHi();
        user.getDog().sayHi();
    }

    @Test
    public void test04(){
        ApplicationContext contextByCtr = new ClassPathXmlApplicationContext("beans-byCtr.xml");
        User user = (User) contextByCtr.getBean("user");
        user.getCat().sayHi();
        user.getDog().sayHi();
    }
}
