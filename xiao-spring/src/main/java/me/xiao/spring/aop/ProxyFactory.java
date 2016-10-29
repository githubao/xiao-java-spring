package me.xiao.spring.aop;

/**
 * 代理工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/29 17:01
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {
    @Override
    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    protected final AopProxy createAopProxy() {
        return new Cglib2AopProxy(this);
    }
}
