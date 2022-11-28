package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication 메타 어노테이션
 * 
 *  +@SpringBootConfiguration: cf. @Configuration - > ex01, ex02
 *  +@ComponentScan			 : ex04 패키지의 하부 패키지 스캐닝을 한다.
 *  +@EnableAutoConfiguration: 
 *  	1. MVC, AOP, Security, JAP 등을 자동으로 "디폴트" 설정(***미세 설정 필수***)
 *  	2. 발견된 Starter Dependency(Library) 기반으로 설정을 한다.
 */


@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
	}	
}
