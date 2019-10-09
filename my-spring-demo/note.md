####BeanDefinition是spring中对加载到spring中的对象的一种扩展（是不是单例，是不是懒加载等）
####IOC容器的初始化过程包含Resource的定位、加载、注册这三个基本过程
spring Bean生命周期是指：bean的创建、初始化、销毁等过程。

需要注意的是单例的Bean生命周期是由容器管理的，非单例并不是由容器管理的

###spring的Bean生命周期的实现方式以下四种方式：
* >@Bean注解配合通过自定义initMethod和DestoryMethod配合注解使用；
* >Spring提供的接口:initializingBean(定义初始化逻辑)和DisposableBean(销毁逻辑)
* >JSR250规范中的注解:@PostConstruct(bean创建完并且属性赋值后调用)和@PreDestory(容器销毁Bean之前通知)
* >BeanPostProcessor接口提供的俩方法: 
     * > postProcessBeforeInitialization:初始化方法（afterPropertiesSet或者initMethod)之前调用
     * > postProcessAfterInitialization:初始化之方法(afterPropertiesSet或者initMethod)之后调用
