package com.changli.applicationContext;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class TestBean {
    private String name;

    public void print(){
        log.info("hello"+name);
    }
}
