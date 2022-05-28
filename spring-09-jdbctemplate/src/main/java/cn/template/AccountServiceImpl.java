package cn.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
/**
 * @Transactional相关参数
 *  1、progagation：事务传播行为：
 *      （1）、事务方法：对数据库表数据进行变化的操作；
 *      （2）、Spring框架事务传播行为有7种；
 *          REQUIRED（常用）：如果有事务在运行，当前的方法就在这个事务内运行，
 *                              否则，就启动一个新的事务，并在自己的事务内运行；
 *                          解释：如果add方法本身有事务，调用update方法之后，update使用当前add方法里面的事务；
 *                               如果add方法本身没有事务，调用update方法之后，创建新事务；
 *          REQUIRED_NEW（常用）：当前的方法必须启动事务，并在它自己的事务内运行，
 *                                  如果有事务正在运行，应该将它刮起；
 *                              解释：使用add方法调用update方法，无论add方法是否有事务（有的话挂起），都创建新的事务；
 *          SUPPORTS：如果有事务在运行，当前的方法就在这个事务内运行，
 *                      否则它可以不运行在事务中；
 *          NOT_SUPPORTED：当前的方法不应该运行在事务中，如果有运行的事务，将它挂起；
 *          MANDATORY：当前的方法必须运行在事务内部，如果没有正在运行的事务，就抛出异常；
 *          NEVER：当前的方法不应该运行在事务中，如果有运行的事务，就抛出异常；
 *          NESTED：如果有事务在运行，当前的方法就应该在这个事务的嵌套事务内运行，
 *                  否则，就启动一个新的事务，并在它自己的事务内运行；
 *  2、isolation：事务隔离级别：
 *      （1）、隔离级别是为了解决事务中的隔离性出现的这么一个概念；
 *      （2）、隔离性是指你在并发操作中产生的一些问题；
 *      （3）、隔离性：多事务在操作之间不会产生影响，不考虑隔离性会产生很多问题；
 *      （4）、有三个读问题：脏读、不可重复读、虚读/幻读；
 *              脏读：一个未提交事务能读取到另一个未提交事务的数据；
 *                      脏读是一个问题；
 *                   账户上有1000元，
 *                   事务A：1000元->2000元，尚未提交，
 *                   事务B：读取到账户2000元，
 *                   事务A：回滚，账户2000元->1000元，
 *                   那么事务A读取到的2000元就是不准确的；
 *              不可重复读：一个未提交事务读取到另一个已提交事务修改数据；
 *                          不可重复读是一个现象；
 *                        账户上有1000元，
 *                        事务A：读取到1000元，
 *                        事务B：读取到1000元，
 *                        事务B：1000元->2000元，立即提交，
 *                        事务A再次读取，可读到账户2000元；
 *              虚读/幻读：一个未提交事务读取到另一个提交事务添加数据；
 *                          虚读/幻读是一个想象；
 *                       本来账户表上只有1条记录；
 *                       事务A：读取到1条记录，
 *                       事务B：插入1条记录，立即提交，
 *                       事务A再次读取，可读到两条数据；
 *      通过设置事务隔离级别，解决读问题：
 *          隔离级别                    脏读  不可重复读   　幻读
 *          读未提交(Read uncommitted)  ✔︎      ✔︎          ✔︎
 *          读已提交(Read committed)    ✖︎      ✔︎          ✔︎
 *          可重复读(Repeatable read)   ✖︎      ✖︎          ✔︎  MySQL默认隔离级别
 *          可串行化(Serializable)      ✖︎      ✖︎          ✖︎
 *  3、timeout：超时时间：
 *      （1）、事务必须在一定时间内提交，如果不提交就进行回滚；
 *      （2）、默认值：-1（不超时）；
 *      （3）、设置时间以秒单位进行计算；
 *  4、readOnly：是否只读；
 *  5、rollbackFor（加上异常类）：回滚
 *      （1）、设置运行中出现那些异常之后进行事务回滚；
 *  6、noRollbackFor（加上异常类）：不回滚
 *      （1）、设置出现哪些异常不进行事务回滚；
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transfer() {
        userDao.reduceMoney();
//        int i = 10 / 0;
        userDao.addMoney();
    }
}
