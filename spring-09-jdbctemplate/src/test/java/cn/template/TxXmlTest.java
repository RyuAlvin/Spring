package cn.template;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxXmlTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-tx.xml");
        cn.template.xml.AccountService accountService = (cn.template.xml.AccountService) context.getBean("accountServiceImpl");
        accountService.transfer();
    }
}
