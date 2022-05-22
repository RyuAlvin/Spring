package cn.anno.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Dog {
    @Value("小黑")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
