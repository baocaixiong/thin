package org.thin.ugc;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@SpringBootApplication
public class ThinApplication
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
//        SpringApplication.run(ThinApplication.class, args);

        SpringApplication springApplication = new SpringApplication(ThinApplication.class);
        System.out.println(springApplication.getSources());

    }
}

