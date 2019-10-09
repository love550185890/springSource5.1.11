####BeanDefinition是spring中对加载到spring中的对象的一种扩展（是不是单例，是不是懒加载等）
####IOC容器的初始化过程包含Resource的定位、加载、注册这三个基本过程
spring Bean生命周期是指：bean的创建、初始化、销毁等过程。
###实现方式：通过自定义initMethod和DestoryMethod配合注解使用；
####需要注意的是单例的Bean生命周期是由容器管理的，非单例并不是由容器管理的
