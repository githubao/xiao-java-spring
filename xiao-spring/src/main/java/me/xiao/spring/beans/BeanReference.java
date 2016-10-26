package me.xiao.spring.beans;

/**
 * bean 对象的引用
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 22:41
 */
public class BeanReference {
    private String name;
    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
