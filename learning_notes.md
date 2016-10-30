1，ApplicationContext context = new ClassPathXmlApplicationContext("xiao-ioc.xml")
一行代码，发生了什么？

新建factory的对象
读取配置资源文件
加载属性值
注册前置，后置处理器
预加载新建每一个bean（创建，前后置处理器处理，set到工厂）

2，资源文件读取加载过程
new ResourceLoader().getResource()
加载beans
“做”加载beans
注册beans
解析beans
处理bean
处理属性


AOP：

概念理解：
一个advisor(增强)=advice(切面，增强的类是哪个)+pointcut(切点，处理表达式的解析，应不应该被增强)
切点包括，类过滤器，方法匹配器，表达式解析器，表达式对象等

advisedSupport包括，被代理的对象，类类型，接口类型

整个过程：
1，
AspectJAwareAdvisorAutoProxyCreator通过实现BeanFactoryAware接口，获取beanFactory的引用。
前面说过，初始化bean初始化对象的时候，如果是BeanFactoryAware类型，会setBeanFactory
2，
实现前后置处理器，通过设置advisedSupport，把advisedSupport作为参数，新建JdkDynamicAopProxy类型动态代理。
advisedSupport的参数，通过“advisor增强器”获得。advisor增强器通过xml配置。
3，
这时候，每个bean都被包装成了JdkDynamicAopProxy对象。
如果符合解析式，通过反射，实现方法调用。调用外部的方法，其实就是调用invoke。
但是现在这个类是代理类，是bean的子类，而且重写了invoke方法。


疑问：
1,
前后置处理器： 为什么需要bean 和 beanName 两个参数?
通过beanName获取信息，对bean操作，最后要return 这个bean。

2,
bean factory aware是什么？
为了获取beanFactory的引用。

3，