package com.changli.applicationContext.parent;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class TestAspect {
    @AfterReturning("bean(testBean*)")
    public void after(){
        log.info("after hello");
    }
}
