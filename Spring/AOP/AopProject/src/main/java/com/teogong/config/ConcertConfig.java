package com.teogong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.teogong.concert.Audience;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@Aspect 애너테이션 된 클래스를 실행시간에 자동으로 프록시 객체를 만들게 함
//Aspect 대상 객체가 인터페이스를 구현한 클래스 이면 proxy 객체도 해당 인터페이스를 구현하게 작성되므로 
//getBean() 매서드로 객체를 가져오려고 시도할 때 타입이 맞지 않아서 에러가 발생하게 됨, 
//이 때 proxy 객체를 대상 클래스를 직접 상속받아 만들게 하여야 하는데 이 때 사용하는 것이 
//proxyTargetClass = true 임
@ComponentScan(basePackages = {"com.teogong.concert"})
public class ConcertConfig {
	
	@Bean
	public Audience audicece() {
		return new Audience();
	}
	
}
