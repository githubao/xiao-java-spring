package me.xiao.spring.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * 测试获取资源
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 18:28
 */
public class ResourceLoaderTest {

    @Test
    public void testGetResource() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("xiao-ioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}