package cn.anno.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Cat {

    @Value("豆豆")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
