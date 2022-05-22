package cn.staticproxy;

import cn.staticproxy.more.UserServiceImpl;
import cn.staticproxy.more.UserServiceProxy;

/**
 * 静态代理角色分析
 *  抽象角色：一般使用接口或者抽象类来实现；
 *  真实角色：被代理的角色；
 *  代理角色：代理真实角色；
 *      代理真实角色后，一般会做一些附属的操作；
 *  客户：使用代理角色来进行一些操作；
 *
 * 静态代理的优点：
 *  可以使得我们的真实角(Host)色更加纯粹，不再去关注一些公共的事情；
 *  公共的业务由代理(Proxy)来完，实现了业务的分工；
 *  公共业务发生扩展时，变得更加集中和方便；
 *
 * 静态代理的缺点：
 *  类多了，多了代理类，工作量变大了，开发效率降低；
 *
 * 我们想要静态代理的好处，又不想要静态代理的缺点，所以，就有了动态代理。
 *
 * 我们在不改变原来的代码的情况下，实现了对原有功能的增强，这是AOP中最核心的思想。
 *  纵向开发：               横向开发：AOP的底层实现机制
 *      dao
 *       ↓
 *      Service             UserService ← Log
 *       ↓
 *      Servlet
 *       ↓
 *      前端
 */
public class StaticClient {

    public static void main(String[] args) {
        // 房东要租房
        Host host = new Host();
        // 中介帮组房东
        Proxy proxy = new Proxy(host);
        // 你去找中介
        proxy.rent();

        /**
         * 在这个过程中，你直接接触的就是中介，就如同现实生活中的样子，
         *  你看不到房东，但是你通过代理依旧租到了房东的房子，这就是所谓的代理模式。
         */

        System.out.println("====================================");

        // 真实业务
        UserServiceImpl userService = new UserServiceImpl();
        // 代理类
        UserServiceProxy serviceProxy = new UserServiceProxy();
        // 实现附加功能
        serviceProxy.setUserService(userService);

        serviceProxy.add();
    }
}
