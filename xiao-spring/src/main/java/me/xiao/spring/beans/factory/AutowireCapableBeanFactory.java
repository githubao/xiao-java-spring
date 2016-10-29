package me.xiao.spring.beans.factory;

import me.xiao.spring.BeanReference;
import me.xiao.spring.aop.BeanFactoryAware;
import me.xiao.spring.beans.BeanDefinition;
import me.xiao.spring.beans.PropertyValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        if (bean instanceof BeanFactoryAware) {
            ((BeanFactoryAware) bean).setBeanFactory(this);
        }

        for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }

            try {
                Method declareMethod = bean.getClass().getDeclaredMethod(
                        "set" + propertyValue.getName().substring(0, 1).toUpperCase()
                                + propertyValue.getName().substring(1), value.getClass());
                declareMethod.setAccessible(true);

                declareMethod.invoke(bean, value);
            } catch (NoSuchMethodException | SecurityException e) {
                Field declaredFiled = bean.getClass().getDeclaredField(propertyValue.getName());
                declaredFiled.setAccessible(true);
                declaredFiled.set(bean, value);
            }

        }
    }
}
