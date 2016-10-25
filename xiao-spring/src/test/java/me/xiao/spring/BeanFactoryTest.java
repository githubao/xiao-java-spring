package me.xiao.spring;

import me.xiao.spring.factory.AbstractBeanFactory;
import me.xiao.spring.factory.AutowireCapableBeanFactory;
import me.xiao.spring.factory.BeanFactory;
import me.xiao.spring.io.ResourceLoader;
import me.xiao.spring.xml.XmlBeanDefinitionReader;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Map;

/**
 * bean 工厂测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:47
 */
public class BeanFactoryTest {

    @Test
    public void testLazy() throws Exception {
        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getSimpleName());

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("xiao-ioc.xml");

        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }

        HelloXiaoService iocHelloXiaoService = (HelloXiaoService) beanFactory.getBean(helloXiaoBeanName);
        iocHelloXiaoService.sayHello();
    }

    @Test
    public void testPreInstantiate() throws Exception {
        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getSimpleName());

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("xiao-ioc.xml");

        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();

        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }

//        首先初始化
        beanFactory.preInstantiateSingletons();

        HelloXiaoService iocHelloXiaoService = (HelloXiaoService) beanFactory.getBean(helloXiaoBeanName);
        iocHelloXiaoService.sayHello();
    }
}