package me.xiao.spring.aop;

import org.aopalliance.aop.Advice;

/**
 * 切面表达式 执行器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:55
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {
    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    private Advice advice;

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public void setExpression(String expression){
        this.pointcut.setExpression(expression);
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }
}
