package me.xiao.spring.factory;

import me.xiao.spring.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽象bean工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:13
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    private List<String> beanDefinitionNames = new ArrayList<>();

    @Override
    public Object getBean(String name) throws Exception {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (null == beanDefinition) {
            throw new IllegalArgumentException("No bean named " + name + " is defined");
        }

        Object bean = beanDefinition.getBean();
        if (bean == null) {
            bean = doCreateBean(beanDefinition);
        }

        return bean;
    }

    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext(); ) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        beanDefinitionMap.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }


    /**
     * 通过重写doCreateBean方法，定义不同类型的创建bean的方式。
     *
     * @param beanDefinition the bean definition
     * @return the object
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
