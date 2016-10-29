package me.xiao.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * 代理相关的元数据
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 20:48
 */
public class AdvisedSupport {
    private TargetSource targetSource;

    //    方法拦截器
    private MethodInterceptor methodInterceptor;

    private MethodMatcher methodMatcher;

    public AdvisedSupport() {
    }

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
}
