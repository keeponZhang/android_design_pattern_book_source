package com.wbb.dp.chapter16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author vico
 * @date 2018-12-02
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface ViewInjector {
    int value();
}
