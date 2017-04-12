package org.thin.ugc;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;


@SpringBootApplication
public class ThinApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        ConfigurableApplicationContext context = SpringApplication.run(ThinApplication.class, args);
        Map<String, ServletContextInitializer> x = context.getBeanFactory().getBeansOfType(ServletContextInitializer.class);

        System.out.println(x);
        Map<String, Servlet> xx = context.getBeansOfType(Servlet.class, true, false);

        System.out.println(xx);

        Map<String, Filter> xxx = context.getBeansOfType(Filter.class, true, false);
        for (Map.Entry<String, Filter> e: xxx.entrySet()) {
            System.out.print(e.getKey() + "===");
            System.out.println(e.getValue());
        }
//        SpringApplication springApplication = new SpringApplication(ThinApplication.class);

//        AnnotationConfigEmbeddedWebApplicationContext context = new AnnotationConfigEmbeddedWebApplicationContext();
//        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context;
    }
}

