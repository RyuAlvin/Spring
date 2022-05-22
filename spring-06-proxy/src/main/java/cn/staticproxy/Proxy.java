package cn.staticproxy;

// 代理角色
public class Proxy implements Rent {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        getFare();
    }

    public void seeHouse() {
        System.out.println("带房客看房");
    }

    public void getFare() {
        System.out.println("收中介费");
    }
}
