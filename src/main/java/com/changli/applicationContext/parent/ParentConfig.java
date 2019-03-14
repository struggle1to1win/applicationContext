package com.changli.applicationContext.parent;

import com.changli.applicationContext.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ParentConfig {
    @Bean
    public TestBean testBeanX(){
        return new TestBean("testBeanX");
    }
    @Bean
    public TestBean testBeanY(){
        return new TestBean("testBeanY");
    }
    @Bean
    public TestAspect testAspect(){
        return new TestAspect();
    }
}
