package me.xiao.spring.aop;

import me.xiao.spring.beans.BeanPostProcessor;
import me.xiao.spring.beans.factory.AbstractBeanFactory;
import me.xiao.spring.beans.factory.BeanFactory;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.List;

/**
 * 切面 自动代理 创建
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/28 21:50
 */
public class AspectJAwareAdvisorAutoProxyCreator implements BeanPostProcessor, BeanFactoryAware {
    private AbstractBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws Exception {
        this.beanFactory = (AbstractBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        if (bean instanceof AspectJExpressionPointcutAdvisor) {
            return bean;
        }
        if (bean instanceof MethodInterceptor) {
            return bean;
        }

        List<AspectJExpressionPointcutAdvisor> advisors = beanFactory.
                getBeanForType(AspectJExpressionPointcutAdvisor.class);

        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            if (advisor.getPointcut().getClassFilter().matches(bean.getClass())) {
                AdvisedSupport advisedSupport = new AdvisedSupport();
                advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
                advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());

                TargetSource targetSource = new TargetSource(bean, bean.getClass().getInterfaces());
                advisedSupport.setTargetSource(targetSource);

                return new JdkDynamicAopProxy(advisedSupport).getProxy();
            }
        }

        return bean;
    }
}
