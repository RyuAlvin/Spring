package cn.start.method;

public class StaticFactory {

    public static GeneralService createGeneralService(){
        System.out.println("静态工厂方法");
        return new GeneralService();
    }
}
