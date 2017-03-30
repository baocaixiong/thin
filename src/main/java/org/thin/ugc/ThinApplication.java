package org.thin.ugc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import javax.servlet.MultipartConfigElement;


@SpringBootApplication
public class ThinApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        ConfigurableApplicationContext context = SpringApplication.run(ThinApplication.class, args);

        for (String o : context.getBeanNamesForType(ServletContextInitializer.class)) {
            System.out.println(o);
            ServletContextInitializer initializer = (ServletContextInitializer) context.getBean(o);
            System.out.println(initializer);
        }

        for (String o : context.getBeanNamesForType(MultipartConfigElement.class)) {
            System.out.println(o);
            MultipartConfigElement element = (MultipartConfigElement) context.getBean(o);
            System.out.println(element);
        }
    }
}

