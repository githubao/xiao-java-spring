package me.xiao.spring;

/**
 * 用于bean的属性注入
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:44
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
