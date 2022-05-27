package cn.aopanno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"cn.aopanno.service"})
@EnableAspectJAutoProxy(proxyTargetClass = false)
/**
 * proxyTargetClass = true
 *      目标对象实现了接口                   -> 使用CGLIB代理机制
 *      目标对象没有实现接口（只有实现类）      -> 使用CGLIB代理机制
 * proxyTargetClass = false
 *      目标对象实现了接口                   -> 使用JDK动态代理机制（代理所有实现了的接口）
 *      目标对象没有实现接口（只有实现类）      -> 使用CGLIB代理机制
 */
public class SpringConfig {

}
