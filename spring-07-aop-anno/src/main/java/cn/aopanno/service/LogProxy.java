package cn.aopanno.service;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogProxy {

    @Pointcut("execution(* cn.aopanno.service.UserService.add(..))")
    public void pt() {

    }

    @Before(value = "pt()")
    public void before() {
        System.out.println("@Before。。。");
    }

    @After(value = "pt()")
    public void after() {
        System.out.println("@After。。。");
    }

    @AfterReturning(value = "pt()")
    public void afterReturning() {
        System.out.println("@AfterReturning。。。");
    }

    @AfterThrowing(value = "pt()")
    public void afterThrowing() {
        System.out.println("@AfterThrowing。。。");
    }

    /**
     * 如果是环绕增强时，使用ProceedingJoinPoint表示连接点对象，该类是JoinPoint的子接口
     *  在这里，连接点指的是add方法
     * @param jp
     * @return
     * @throws Throwable
     */
    @Around(value = "pt()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around前。。。");
        // 若在这里指定参数，则使用这里的参数，而不使用调用时的参数了
        Object result = jp.proceed(new Object[]{8, 0});
        System.out.println("@Around后。。。");
        return result;
    }
}
