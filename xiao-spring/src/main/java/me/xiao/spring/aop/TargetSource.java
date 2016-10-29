package me.xiao.spring.aop;

/**
 * 被代理的对象
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 20:49
 */
public class TargetSource {
    private Class<?>[] targetClass;
    private Object target;

    public TargetSource(Object target,Class<?>... targetClass) {
        this.targetClass = targetClass;
        this.target = target;
    }


    public Class<?>[] getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }
}
