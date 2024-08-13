package com.example.day0717_restapi;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAspect {
  @Around("@annotation(LogExecutionTime)")
  public Object logExecutionTime(ProceedingJoinPoint jointPoint) throws Throwable {
    long startTime = System.currentTimeMillis();

    Object result = jointPoint.proceed();

    long endTime = System.currentTimeMillis();

    long executionTime = endTime - startTime;

    String methodName = jointPoint.getSignature().getName();

    log.info("메서드: {} 실행시간: {} ms", methodName, executionTime);

    return result;
  }
}
