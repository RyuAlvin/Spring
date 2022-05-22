package cn.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * InvocationHandler：调用处理程序
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        // Proxy提供了创建动态代理类和实例的静态方法
        return Proxy.newProxyInstance(
                // 类加载器来定义代理类
                this.getClass().getClassLoader(),
                // 代理类实现的接口列表
                rent.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // 本质利用反射实现
        Object result = method.invoke(rent, args);
        getFare();
        return result;
    }

    public void seeHouse() {
        System.out.println("带房客看房");
    }

    public void getFare() {
        System.out.println("收中介费");
    }
}
