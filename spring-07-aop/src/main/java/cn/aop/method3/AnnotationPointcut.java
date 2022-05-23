package cn.aop.method3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {

    @Before("execution(* cn.aop.method1.UserServiceImpl.*(..))")
    public void beore() {
        System.out.println("-----------方法执行前-----------");
    }

    @After("execution(* cn.aop.method1.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-----------方法执行后-----------");
    }

    @Around("execution(* cn.aop.method1.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名："+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
