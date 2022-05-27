package cn.di.test;

import cn.di.pojo.City;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilListTest {

    @Test
    public void test01() {
        // util:list标签提取集合测试
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-util.xml");
        City city = (City) context.getBean("city");
        System.out.println(city);
    }
}
