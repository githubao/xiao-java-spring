package me.xiao.spring.factory;

import me.xiao.spring.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽象bean工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:13
 */
public abstract class AbstractBeanFactory implements BeanFactory{
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception{
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);

        beanDefinitionMap.put(name, beanDefinition);
    }


    /**
     * 通过重写doCreateBean方法，定义不同类型的创建bean的方式。
     *
     * @param beanDefinition the bean definition
     * @return the object
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
