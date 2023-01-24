package com.variant1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CommitServiceAspect {

    @Around("@annotation(CommitServiceAdvice) && args(mfa)"
            /*, argNames="mfa"*/)
    public Object advice(ProceedingJoinPoint joinPoint, Object mfa) throws Throwable {
        System.out.println(">>> matching advice on {}" + joinPoint);
        mfa= (Object) joinPoint.proceed();
        System.out.println("<<< returning advice on {}" + joinPoint);

        return mfa;
    }
}