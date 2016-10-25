package me.xiao.spring.factory;

import me.xiao.spring.BeanDefinition;

/**
 * 可以自动装载的bean工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:18
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            return beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
