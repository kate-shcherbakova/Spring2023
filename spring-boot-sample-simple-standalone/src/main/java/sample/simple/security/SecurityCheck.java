package sample.simple.security;

import java.lang.annotation.*;

// annotation to mark methods that require security checks
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SecurityCheck {

}
