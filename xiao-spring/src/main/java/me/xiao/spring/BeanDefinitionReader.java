package me.xiao.spring;

/**
 * 从配置中读取eanDefinition的信息
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 17:54
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
