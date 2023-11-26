package sample.simple.security;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPSecurityAspect {

    @Around("execution(public * sample.simple..*.*(..)) && @annotation(SecurityCheck)")
    public Object performSecurityCheck(ProceedingJoinPoint joinPoint) throws Throwable {

        if (isAuthorized()) {
            System.out.println("- AOP security - Access granted");
            return joinPoint.proceed();
        } else {
            throw new SecurityException("- AOP security - Access Denied");
        }
    }

    private boolean isAuthorized() {
        return true; // for test
    }
}
