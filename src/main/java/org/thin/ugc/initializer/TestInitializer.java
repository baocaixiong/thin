package org.thin.ugc.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 配置
 * context.initializer.classes=org.thin.ugc.initializer.TestInitializer 即可自动在 SpringApplication.prepareContext(刚创建完context)中调用
 *
 * ##功能来自
 * org.springframework.boot.context.config.DelegatingApplicationContextInitializer
 * 定义在spring-boot.MATE-INFO/spring.factories中
 */
public class TestInitializer implements ApplicationContextInitializer
{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext)
    {
        System.out.println("my initializer");
    }
}
