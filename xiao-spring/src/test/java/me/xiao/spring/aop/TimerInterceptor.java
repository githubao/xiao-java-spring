package me.xiao.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 时间拦截器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:21
 */
public class TimerInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long startTime = System.currentTimeMillis();

        System.out.println("Invocation of Method: " + invocation.getMethod().getName() + " start!");

        Object proceed = invocation.proceed();

        System.out.println("Invocation of Method: " + invocation.getMethod().getName() + " end!");

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("total time：" + totalTime + "(ms)");

        return proceed;
    }
}
