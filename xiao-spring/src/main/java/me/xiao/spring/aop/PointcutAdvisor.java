package me.xiao.spring.aop;

/**
 * 切点 通知的执行者
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:41
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
