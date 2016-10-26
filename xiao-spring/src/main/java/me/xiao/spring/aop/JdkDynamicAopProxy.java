package me.xiao.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 20:49
 */
public class JdkDynamicAopProxy implements AopProxy,InvocationHandler{
    private AdvisedSupport advised;

    public JdkDynamicAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{advised.getTargetSource().getTargetClass()},this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
        return methodInterceptor.invoke(new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(),method,args));
    }
}
