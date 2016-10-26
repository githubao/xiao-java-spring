package me.xiao.spring.aop;

/**
 * 切点
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:38
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
