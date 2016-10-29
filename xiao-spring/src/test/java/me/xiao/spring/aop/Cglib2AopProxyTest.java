package me.xiao.spring.aop;

import me.xiao.spring.HelloXiaoService;
import me.xiao.spring.HelloXiaoServiceImpl;
import me.xiao.spring.context.ApplicationContext;
import me.xiao.spring.context.ClassPathXmlApplicationContext;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * cglib 切面代理 测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/29 17:31
 */
public class Cglib2AopProxyTest {
    @Test
    public void testInterceptor() throws Exception {
        String helloXiaoBeanName = StringUtils.uncapitalize(HelloXiaoService.class.getSimpleName());

        ApplicationContext context = new ClassPathXmlApplicationContext("xiao-ioc.xml");
        HelloXiaoService helloXiaoService = (HelloXiaoService) context.getBean(helloXiaoBeanName);
        helloXiaoService.sayHello();

        System.out.println("new cglib2 proxy");

//        设置代理对象
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloXiaoService, HelloXiaoServiceImpl.class, HelloXiaoService.class);
        advisedSupport.setTargetSource(targetSource);

//        设置拦截器
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

//        创建代理
        Cglib2AopProxy cglib2AopProxy = new Cglib2AopProxy(advisedSupport);
        HelloXiaoService helloXiaoServiceProxy = (HelloXiaoService) cglib2AopProxy.getProxy();

//        调用
        helloXiaoServiceProxy.sayHello();
    }
}