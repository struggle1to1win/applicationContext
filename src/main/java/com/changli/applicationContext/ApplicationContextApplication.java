package com.changli.applicationContext;

import com.changli.applicationContext.parent.ParentConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Slf4j
public class ApplicationContextApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext parent = new AnnotationConfigApplicationContext(ParentConfig.class);
		ClassPathXmlApplicationContext child =new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"},parent);

		TestBean beanFromParent = parent.getBean("testBeanX",TestBean.class);
		beanFromParent.print();
		log.info("================================================");

		TestBean beanFromChild =child.getBean("testBeanX",TestBean.class);
		beanFromChild.print();

		beanFromChild =child.getBean("testBeanY",TestBean.class);
		beanFromChild.print();
	}
}
