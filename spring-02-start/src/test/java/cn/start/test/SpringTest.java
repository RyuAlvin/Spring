package cn.start.test;

import cn.start.pojo.User;
import cn.start.service.DBInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    /**
     * 控制反转IoC(Inversion of Control)，是一种设计思想，依赖注入(DI)是实现IoC的一种方法。
     * <p>
     * 以下User对象以及属性都是由Spring创建的，这个过程就叫控制反转。
     * 控制：谁来控制对象的出啊过年就爱你，传统应用程序的对象是由程序本身控制创建的，
     * 使用Spring后，对象是由Spring来创建的；
     * 反转：程序本身不创建对象，而编程被动的接收对象；
     * <p>
     * 依赖注入：就是利用set方法来进行注入的；
     * <p>
     * IoC是一种编程思想，由主动的编程编程被动的接收；
     */
    @Test
    public void test01() {
        User user = (User) context.getBean("user");
        user.sayHi();
    }

    @Test
    public void test02() {
        //修改oldimpl模块中的案例
        DBInfoService service = (DBInfoService) context.getBean("dbInfoService");
        service.getDBInfo();
    }

    @Test
    public void test03() {
        //通过有参构造方法来创建对象
        User userCtrByIndex = (User) context.getBean("userCtrByIndex");
        userCtrByIndex.sayHi();
        User userCtrByName = (User) context.getBean("userCtrByName");
        userCtrByName.sayHi();
        User userCtrByType = (User) context.getBean("userCtrByType");
        userCtrByType.sayHi();
    }

    @Test
    public void test04() {
        //设置别名
        User user = (User) context.getBean("helloihavealias");
        user.sayHi();
    }

    @Test
    public void test05() {
        //设置name
        User user1 = (User) context.getBean("user001");
        user1.sayHi();
        User user2 = (User) context.getBean("user002");
        user1.sayHi();
        User user3 = (User) context.getBean("user003");
        user1.sayHi();
        User user4 = (User) context.getBean("user004");
        user1.sayHi();
    }
}
