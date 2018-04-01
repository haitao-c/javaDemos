package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)             //定义注解将用在什么地方
@Retention(RetentionPolicy.RUNTIME)     //定义该注解在哪一个级别可用
public @interface UseCase {
    public int id();
    public String description() default "no description";
}
