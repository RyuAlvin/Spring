package cn.dynamicproxy;

import cn.dynamicproxy.more.UserService;
import cn.dynamicproxy.more.UserServiceImpl;
import cn.dynamicproxy.more.UserServiceProxyInvocationHandler;

/**
 * 动态代理的角色和静态代理的一样；
 * 动态代理的代理类是动态生成的，静态代理的代理类是我们提前写好的；
 * 动态代理分为两类：基于接口的动态代理，基于类的动态代理；
 *  基于接口的动态代理，JDK动态代理；
 *  基于类的动态代理，CGLIB；
 *  现在用的比较多的是JAVAssist来生成动态代理；
 *  这里使用JDK原来代码来实现，其它道理都是一样；
 *
 * 一个动态代理，一般代理某一类业务，一个动态代理可以代理多个类，代理的是接口！
 *
 * 动态代理的好处：
 *  静态代理有的它都有，静态代理没有的，它也有。
 *      可以使得我们的真实角色更加纯粹，不再去关注一些公共的事情；
 *      公共的业务由代理来完成，实现了业务的分工；
 *      公共业务发生扩展时变得更加集中和方便；
 *      一个动态代理，一般代理某一类业务；
 *      一个动态代理可以代理多个类，代理的是接口！
 */
public class DynamicClient {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 将真实角色放置进去
        pih.setRent(host);
        // 动态生成对应的代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

        System.out.println("====================================");

        UserService userService = new UserServiceImpl();
        UserServiceProxyInvocationHandler handler = new UserServiceProxyInvocationHandler();
        handler.setTarget(userService);
        UserService serviceProxy = (UserService) handler.getProxy();
        serviceProxy.add();
    }
}
