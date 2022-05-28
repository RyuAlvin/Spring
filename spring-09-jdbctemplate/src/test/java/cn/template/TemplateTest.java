package cn.template;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserDao userDao = (UserDao) context.getBean("userDaoImpl");

    @Test
    public void test01() {
        userDao.getAllUser().forEach(System.out::println);
    }

    @Test
    public void test02() {
        System.out.println(userDao.getUser(8));
    }

    @Test
    public void test03() {
        userDao.addUser(new User(12, "heiheiheihi", "12123213"));
    }

    @Test
    public void test04() {
        userDao.deleteUser(12);
    }

    @Test
    public void test05() {
        userDao.updateUser(new User(7, "111", "111"));
    }

    @Test
    public void test06() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{11, "11", "11"});
        list.add(new Object[]{12, "12", "12"});
        list.add(new Object[]{13, "13", "13"});
        int[] result = userDao.batchAdd(list);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void test07() {
        AccountService accountService = (AccountService) context.getBean("accountServiceImpl");
        accountService.transfer();
    }
}
