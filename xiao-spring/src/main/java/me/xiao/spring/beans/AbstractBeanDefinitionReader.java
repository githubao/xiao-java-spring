package me.xiao.spring.beans;

import me.xiao.spring.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 读取配置文件抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 17:54
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
