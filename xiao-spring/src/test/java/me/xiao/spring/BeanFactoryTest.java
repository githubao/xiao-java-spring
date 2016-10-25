package me.xiao.spring;

import me.xiao.spring.factory.AutowireCapableBeanFactory;
import me.xiao.spring.factory.BeanFactory;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * bean 工厂测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:47
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getName());
        String helloXiaoBeanPath = "me.xiao.spring.HelloXiaoService";

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName(helloXiaoBeanPath);

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text","Hello xiao"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition(helloXiaoBeanName, beanDefinition);

        HelloXiaoService iocHelloXiaoService = (HelloXiaoService) beanFactory.getBean(helloXiaoBeanName);
        iocHelloXiaoService.sayHello();

    }
}