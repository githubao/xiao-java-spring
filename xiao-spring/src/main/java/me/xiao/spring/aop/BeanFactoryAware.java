package me.xiao.spring.aop;

import me.xiao.spring.beans.factory.BeanFactory;

/**
 * 获取beanFactory的资源
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/28 21:51
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
