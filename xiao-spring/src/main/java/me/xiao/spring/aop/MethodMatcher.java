package me.xiao.spring.aop;

import java.lang.reflect.Method;

/**
 * 方法的匹配器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:39
 */
public interface MethodMatcher {
    boolean matches(Method method,Class targetClass);
}
