package sample.simple.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPExecutionLogger {

    @Before("execution(public * sample.simple..*.*(..))")
    public void logMethodExecution(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("- AOP logging - Executed method: " + methodName + " in class: " + className);
    }
}
