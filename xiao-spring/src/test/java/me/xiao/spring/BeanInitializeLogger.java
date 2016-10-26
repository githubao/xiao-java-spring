package me.xiao.spring;

import me.xiao.spring.beans.BeanPostProcessor;

/**
 * bean 的前置和后置 处理
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 23:42
 */
public class BeanInitializeLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " start!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " end!");
        return bean;
    }
}
