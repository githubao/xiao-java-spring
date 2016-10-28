package me.xiao.spring.beans.factory;

import me.xiao.spring.beans.BeanDefinition;
import me.xiao.spring.BeanReference;
import me.xiao.spring.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * 可以自动装载的bean工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 15:18
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
        for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
            Field declaredFiled = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredFiled.setAccessible(true);

            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            declaredFiled.set(bean, value);
        }
    }
}
