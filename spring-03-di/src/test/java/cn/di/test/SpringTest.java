package cn.di.test;

import cn.di.pojo.Address;
import cn.di.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    ApplicationContext contextScope = new ClassPathXmlApplicationContext("beans-scope.xml");

    @Test
    public void test01() {
        // 数据类型的属性注入
        Student student = (Student) context.getBean("stu");
        System.out.println(student);
    }

    @Test
    public void test02() {
        // p,c命名空间注入
        Address addrP = (Address) context.getBean("addrP");
        Address addrC = (Address) context.getBean("addrC");
        System.out.println(addrP);
        System.out.println(addrC);
    }

    @Test
    public void test03() {
        // 作用域测试
        Address addrSingleton1 = (Address) contextScope.getBean("addrSingleton");
        Address addrSingleton2 = (Address) contextScope.getBean("addrSingleton");
        System.out.println(addrSingleton1 == addrSingleton2); //true
    }
}
