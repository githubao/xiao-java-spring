package me.xiao.spring.context;

import me.xiao.spring.beans.BeanDefinition;
import me.xiao.spring.beans.factory.AbstractBeanFactory;
import me.xiao.spring.beans.factory.AutowireCapableBeanFactory;
import me.xiao.spring.beans.io.ResourceLoader;
import me.xiao.spring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * TODO description
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 19:42
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }
    }
}
