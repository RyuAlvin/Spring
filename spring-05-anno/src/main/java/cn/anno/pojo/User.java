package cn.anno.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class User {
    @Value("sBen")
    private String name;

    public String getName() {
        return name;
    }

//    @Value("Ryu")
    public void setName(String name) {
        this.name = name;
    }
}
