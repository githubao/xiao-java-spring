package me.xiao.spring.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装一个对应对应的所有属性
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:58
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
