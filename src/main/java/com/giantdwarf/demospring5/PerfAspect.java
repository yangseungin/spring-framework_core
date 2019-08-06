package com.giantdwarf.demospring5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //advice가 적용되는 대상
    //Around는 메소드 자체를 감싸고있기때문에 메소드 전후에 작업을 넣을 수 있
    //@Around("execution(* com.giantdwarf..*.EventService.*(..))")  //com.giantdwarf 시작하는 패키지밑에있는 모든클래스중 eventservice안에 있는 모든메소드에 아래르 ㄹ적용하라
    //@Around("bean(simpleEventService)") // 빈도 가능함
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello(){
        System.out.println("hello");
    }

}
