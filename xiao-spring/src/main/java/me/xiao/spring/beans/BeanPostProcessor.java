package me.xiao.spring.beans;

/**
 * bean 的后置处理器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 23:29
 */
public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
