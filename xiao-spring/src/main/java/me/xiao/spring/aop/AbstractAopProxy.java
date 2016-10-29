package me.xiao.spring.aop;

/**
 * 切面代理抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/29 16:59
 */
public abstract class AbstractAopProxy implements AopProxy{
    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
