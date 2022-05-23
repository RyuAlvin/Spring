package cn.aop.method2;

public class DiyPointcut {
    public void diyBefore(){
        System.out.println("-----------方法执行前-----------");
    }

    public void diyAfter(){
        System.out.println("-----------方法执行后-----------");
    }
}
