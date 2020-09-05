package com.wbb.dp.chapter12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 事件接收函数的注解类，运用在函数上
 * @author weibb
 * @date 2018-11-19
 * email: weibb@chingo.cn
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Subscriber {
    
}
