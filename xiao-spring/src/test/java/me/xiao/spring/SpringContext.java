package me.xiao.spring;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
                ClassPathXmlApplicationContext.class,
                EmbeddedWebApplicationContext.class,
                FactoryBean.class,
                BeanPostProcessor.class);

        for (Class clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }

    }

}
