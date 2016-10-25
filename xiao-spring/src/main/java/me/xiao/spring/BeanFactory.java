package me.xiao.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean 工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:44
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
