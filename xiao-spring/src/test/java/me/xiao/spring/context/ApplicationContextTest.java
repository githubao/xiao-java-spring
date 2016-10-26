package me.xiao.spring.context;

import me.xiao.spring.HelloXiaoService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 应用上下文测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 19:52
 */
public class ApplicationContextTest {
    @Test
    public void testApplicationContext() throws Exception {
        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getSimpleName());

        ApplicationContext context = new ClassPathXmlApplicationContext("xiao-ioc.xml");
        HelloXiaoService helloXiaoService = (HelloXiaoService) context.getBean(helloXiaoBeanName);
        helloXiaoService.sayHello();
    }
}