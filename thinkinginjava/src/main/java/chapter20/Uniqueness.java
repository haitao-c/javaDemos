package chapter20;

import java.lang.annotation.Target;


public @interface Uniqueness {
    Constraints constrations() default @Constraints(unique=true);
}
