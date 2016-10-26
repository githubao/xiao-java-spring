package me.xiao.spring.beans;

/**
 * bean 定义
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:43
 */
public class BeanDefinition {
    private Object bean;

    private Class beanClass;

    private String beanClassName;

    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition() {
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
