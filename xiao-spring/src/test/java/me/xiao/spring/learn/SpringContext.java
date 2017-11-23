package me.xiao.spring.learn;

import org.junit.Test;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterChain;
import java.util.Arrays;
import java.util.List;

/**
 * 阅读源码
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/15 18:39
 */

public class SpringContext {

    @Test
    public void testContext() {

        List<Class> classes = Arrays.asList(
                FactoryBean.class,
                BeanFactory.class,
                BeanWrapper.class,
                BeanPostProcessor.class,
                DefaultListableBeanFactory.class,
                ClassPathXmlApplicationContext.class,
                EmbeddedWebApplicationContext.class,
                DispatcherServlet.class,
                SpringApplication.class,
                AbstractAutoProxyCreator.class,
                FilterChain.class);

        for (Class clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }

    }

}
