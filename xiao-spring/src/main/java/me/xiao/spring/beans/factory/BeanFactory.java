package me.xiao.spring.beans.factory;

/**
 * Bean 工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:44
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
}
