package org.thin.common.annotation;

import java.lang.annotation.*;

/**
 * @author baidu
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckLogined
{
    boolean value() default true;
}
