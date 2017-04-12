package org.thin.ugc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

/**
 * 每个Bean被初始化的时候都会调用
 * @author baidu
 */
@Component
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor
{
    private static final Logger logger = LoggerFactory.getLogger(BeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
//        logger.warn("before bean initialize, beanName=" + beanName + ", object=" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
//        logger.warn("after bean initialize, beanName=" + beanName + ", object=" + bean);
        return bean;
    }
}
