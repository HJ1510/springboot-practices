package com.bitacademy.springboot.helloworld;

//import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. 스프링 애플리케이션의 부트스트래핑 역할(Bootstraping Class) =>없으면 실행이 안됨
 * 2. 설정 클래스 역할(Configuration Class)
 *
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일(Bootstraping)
		 * 
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 만약 웹 애플리케이션이면, 웹 애플리케이션 타입을 결정(Spring MVC or Reactive) 
		 * 3. 어노테이션 스캐닝(Auto) + Configuration Class(Explicity) 통한 빈생성/등록/와이어링 작업 => 최상단에 두는 게 좋음
		 * 4. 만약 웹 애플리케이션 중 Spring MVC면 
		 * 		- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스탄스 생성
		 * 		- 서버 인스턴스에 웹 애플리케이션을 배포
		 * 		- 서버 인스탄스 실행
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행(run 호출)
		 */
		// SpringApplication.run(HelloWorldApplication.class, args);
		
//		1.
//		ConfigurableApplicationContext ac=null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args); // run은 Container를 return 해줌
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			ac.close();
//		}
		
	// 2. try ~ with ~ resources 구문 => try만 써도 자동으로 닫아줌.. = 1
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	
	}

}
