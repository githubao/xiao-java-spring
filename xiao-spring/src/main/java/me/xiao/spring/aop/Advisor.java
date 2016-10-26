package me.xiao.spring.aop;

import org.aopalliance.aop.Advice;

/**
 * 切点和通知的耦合器，通知的执行者
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:37
 */
public interface Advisor {
    Advice getAdvice();
}
