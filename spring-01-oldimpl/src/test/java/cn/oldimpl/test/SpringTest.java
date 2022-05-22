package cn.oldimpl.test;

import cn.oldimpl.dao.impl.DBInfoDaoOracleImpl;
import cn.oldimpl.service.DBInfoService;
import cn.oldimpl.service.impl.DBInfoServiceImpl;
import org.junit.Test;

public class SpringTest {

    @Test
    public void test01() {
        /**
         * 当我们需要什么数据库信息的时候，又需要去service实现类里面修改对应的实现，
         *  假设我们的这种需求非常大，这种方式就根本不适用了，甚至反人类，
         *  每次变动，都需要修改大量代码。
         *  这种设计的耦合性太高了，牵一发而动全身。
         */
//        DBInfoService service = new DBInfoServiceImpl();
//        service.getDBInfo();


        /**
         * 预留接口，利用set后
         *
         * 发生了什么变化？
         *  以前的方式，所有东西都是由程序去进行控制创建；
         *  现在的方式，都是由我们自行控制创建对象，
         *      把主动权交给了调用者，程序不用去管怎么创建，怎么实现，只负责提供一个接口。
         *      这种思想，从本质上解决了问题，我们程序员不用再去管理对象的创建，更多地去关注业务的实现。
         *      耦合性大大降低，这也就是IOC的原型
         */
        DBInfoServiceImpl dbInfoService = new DBInfoServiceImpl();
        dbInfoService.setDbInfoDao(new DBInfoDaoOracleImpl());
        dbInfoService.getDBInfo();
    }
}
