package me.xiao.spring.aop;

import me.xiao.spring.HelloXiaoService;
import me.xiao.spring.context.ApplicationContext;
import me.xiao.spring.context.ClassPathXmlApplicationContext;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 动态类代理测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 22:16
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception {
        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getSimpleName());

        ApplicationContext context = new ClassPathXmlApplicationContext("xiao-ioc.xml");
        HelloXiaoService helloXiaoService = (HelloXiaoService) context.getBean(helloXiaoBeanName);
        helloXiaoService.sayHello();

//        设置被代理对象，jointPoint
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloXiaoService, HelloXiaoService.class);
        advisedSupport.setTargetSource(targetSource);

//        设置拦截器
        TimeInterceptor timeInterceptor = new TimeInterceptor();
        advisedSupport.setMethodInterceptor(timeInterceptor);

//        创建代理
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloXiaoService helloXiaoServiceProxy = (HelloXiaoService) jdkDynamicAopProxy.getProxy();

//        基于AOP 调用
        helloXiaoServiceProxy.sayHello();


    }
}