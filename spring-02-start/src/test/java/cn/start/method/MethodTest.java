package cn.start.method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("method-bean.xml");
        // 使用默认构造函数创建
        GeneralService generalService1 = (GeneralService) context.getBean("generalService1");
        generalService1.findGeneralService();

        System.out.println("------------------");

        // 实例工厂方法
        GeneralService generalService2 = (GeneralService) context.getBean("generalService2");

        System.out.println("------------------");

        // 静态工厂方法
        GeneralService generalService3 = (GeneralService) context.getBean("generalService3");
    }
}
