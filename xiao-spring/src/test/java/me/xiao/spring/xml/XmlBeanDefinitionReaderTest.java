package me.xiao.spring.xml;

import me.xiao.spring.BeanDefinition;
import me.xiao.spring.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * xml配置文件读取测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 22:17
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void testLoadBeanDefinitions() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("xiao-ioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }
}