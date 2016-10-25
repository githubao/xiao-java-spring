package me.xiao.spring.factory;

import me.xiao.spring.BeanDefinition;

/**
 * Bean 工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:44
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
