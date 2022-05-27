package cn.start.test;

import cn.start.pojo.LifecycleBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-bean.xml");
        LifecycleBean bean = context.getBean("lifecycleBean", LifecycleBean.class);
        System.out.println("第六步：调用对象；");
        System.out.println(bean);

        /**
         * 第一步：调用无参构造函数创建对象；
         * 第二步：为对象注入属性；
         * 第三步：初始化前的后置处理器方法；
         * 第四步：初始化方法；
         * 第五步：初始化后的后置处理器方法；
         * 第六步：调用对象；
         * cn.start.pojo.LifecycleBean@401e7803
         */
    }
}
