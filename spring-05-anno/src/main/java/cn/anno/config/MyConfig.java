package cn.anno.config;

import cn.anno.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * JavaConfig原来是Spring的一个子项目，它通过Java类的方式提供Bean的定义信息，
 *  在Spring4的版本，JavaConfig已正式成为Spring4的核心功能。
 */
@Configuration
@Import(MyConfig2.class) // 导入合并其它配置类，类似于配置文件中的include标签
public class MyConfig {

    @Bean // 通过方法注册一个bean，这里的返回值就是bean的类型，方法名就是bean的id
    public Dog dog() {
        return new Dog();
    }
}
