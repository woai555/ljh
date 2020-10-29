package com.ljh;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AopLogAspect {


    private static final Logger logger = LoggerFactory.getLogger(AopLogAspect.class);


    @Pointcut("execution(* com.ljh.service.impl.VAppScheduleServiceImpl.getSchedule(..) ) ")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void boBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method Name : [" + methodName + "] ---> AOP before ");
    }

    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method Name : [" + methodName + "] ---> AOP after ");
    }

    @AfterReturning(pointcut = "pointCut()",returning = "result")
    public void afterReturn(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method Name : [" + methodName + "] ---> AOP after return ,and result is : " + result.toString());
    }

    @AfterThrowing(pointcut = "pointCut()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method Name : [" + methodName + "] ---> AOP after throwing ,and throwable message is : " + throwable.getMessage());
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        try {
            logger.info("Method Name : [" + methodName + "] ---> AOP around start, args are " + Arrays.asList(args));
            long startTimeMillis = System.currentTimeMillis();
            //调用 proceed() 方法才会真正的执行实际被代理的方法
            Object result = joinPoint.proceed();
            long execTimeMillis = System.currentTimeMillis() - startTimeMillis;
            logger.info("Method Name : [" + methodName + "] ---> AOP method exec time millis : " + execTimeMillis);
            logger.info("Method Name : [" + methodName + "] ---> AOP around end , and result is : " + result.toString());
            return result;
        } catch (Throwable te) {
            logger.error(te.getMessage(),te);
            throw new RuntimeException(te.getMessage());
        }
    }
}
