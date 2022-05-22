package cn.autowired.anno.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Autowired
 *  Spring内置（2.5+）的org.springframework.bean.factory
 * @Resource
 *  JDK内置（Java JSR-250）javax.annotation
 *
 * 区别：
 *  Autowired是Spring提供的注解，Resource是JDK提供的注解；
 *  Autowired默认的注入方式为byType（根据类型进行匹配），Resource默认注入方式为byName（根据名称进行匹配）；
 *  当一个接口存在多个实现累的情况下，Autowired和Resource都需要通过名称才能正确匹配到对应的bean。
 *      Autowired可以通过Qualifier注解来显示指定名称，
 *      Resource可以通过name属性来显示指定名称。
 */
public class User {
    /**
     * @Autowired是按类型自动装配的，不支持id匹配
     *      @Autowired+@Qualifier则可以根据byName的方式自动装配
     *      当容器中存在同类型不同名的多个bean的时候，可以通过@Atuwired+@Qualifier的方式进行自动装配
     */
    @Autowired(required = false)
    // @Qualifier不能单独使用
    @Qualifier("cat1")
    private Cat cat;

    /**
     * @Resource如果有指定的name属性，先按该属性进行byName方式查找装配；
     *      若找不到，则再进行默认的byName方式进行装配，即属性名；
     *      若以上都不成功，则按byType的方式自动装配，都不成功，则报异常
     */
    @Resource(name = "dog")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
