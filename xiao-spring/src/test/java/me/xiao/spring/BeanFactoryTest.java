package me.xiao.spring;

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
        BeanFactory beanFactory = new BeanFactory();

        HelloXiaoService helloXiaoService = new HelloXiaoService();
        String helloXiaoBeanName = StringUtils.uncapitalize(helloXiaoService.getClass().getName());

        BeanDefinition beanDefinition = new BeanDefinition(helloXiaoService);
        beanFactory.registerBeanDefinition(helloXiaoBeanName, beanDefinition);

        HelloXiaoService iocHelloXiaoService = (HelloXiaoService) beanFactory.getBean(helloXiaoBeanName);
        iocHelloXiaoService.sayHello();

    }
}