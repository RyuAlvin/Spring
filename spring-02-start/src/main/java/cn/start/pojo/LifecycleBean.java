package cn.start.pojo;

/**
 * 第一步：调用无参构造函数创建对象；
 * 第二步：为对象注入属性；
 * 第三步：初始化前的后置处理器方法；
 * 第四步：初始化方法；
 * 第五步：初始化后的后置处理器方法；
 * 第六步：调用对象；
 * cn.start.pojo.LifecycleBean@401e7803
 */
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("第一步：调用无参构造函数创建对象；");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：为对象注入属性；");
    }

    public void initMethod() {
        System.out.println("第四步：初始化方法；");
    }

    public void destroyMethod(){
        System.out.println("第七步：销毁方法。");
    }
}
