package com.example.springaspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
public class Audience {

    @Pointcut("execution(** com.example.springaspect.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhone(){
        log.info("Silencing Cell Phone");
    }
    
    @Before("performance()")
    public void takeSeats(){
        log.info("Taking Seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        log.info("CLAP!CLAP!CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        log.info("Demanding a refund");
    }
}
