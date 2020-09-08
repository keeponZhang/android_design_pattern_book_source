package zhushen.com.shejimoshi.chapter16.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Zhushen on 2018/5/23.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface ViewInjector {
    int value();
}
