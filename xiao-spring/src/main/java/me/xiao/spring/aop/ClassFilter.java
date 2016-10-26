package me.xiao.spring.aop;

/**
 * 类过滤器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:38
 */
public interface ClassFilter {
    boolean matches(Class targetClass);
}
