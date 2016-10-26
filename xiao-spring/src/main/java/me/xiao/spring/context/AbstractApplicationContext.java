package me.xiao.spring.context;

import me.xiao.spring.beans.factory.AbstractBeanFactory;

/**
 * 应用上下文抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 19:42
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception {

    }

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }
}
