package cn.start.method;

public class GeneralFactory {

    public GeneralService createGeneralService(){
        System.out.println("实例工厂方法");
        return new GeneralService();
    }
}
