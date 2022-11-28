package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Application Context가 구성되었고 이후에 실행 할 코드(Application Context 환경에 의존)가 있는 경우
 * ApplicationRunner 인터페이스의 구현 클래스(HelloWorldRunner) 빈 사용하기
 *
 */

@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
		
	}	
}
