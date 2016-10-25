package me.xiao.spring;

/**
 * bean 定义
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:43
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition() {
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
