package me.xiao.spring.aop;

import me.xiao.spring.HelloXiaoService;
import me.xiao.spring.HelloXiaoServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * 面向切面，测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 23:17
 */
public class AspectJExpressionPointcutTest {
    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* me.xiao.spring.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloXiaoService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "excution(* me.xiao.spring.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);

        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloXiaoServiceImpl.class.getDeclaredMethod("sayHello"), HelloXiaoServiceImpl.class);

        Assert.assertTrue(matches);

    }
}