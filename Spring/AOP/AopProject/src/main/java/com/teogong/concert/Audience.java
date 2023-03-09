package com.teogong.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	//정의해서 코드를 간결하게 만들여면 @Pointcut을 사용하자 
	@Pointcut("execution(* com.teogong.concert.Performance.perform(..))")
	public void performance() {}
	
//	@Before("performance()")
//	//@Before 메소드 실행전에 실행,* 리턴타입 상관 없다., ..파라미터가 뭐가 오든지 상관없다.
////	@Before("execution(* com.teogong.concert.Performance.perform(..))")
//	public void silenceCellPones() {
//		System.out.println("Sliencing cell phones");
//	}
//	
//	@Before("performance()")
////	@Before("execution(* com.teogong.concert.Performance.perform(..))")
//	public void takeSeats() {
//		System.out.println("Taking seats");
//	}
//	
//	@AfterReturning("performance()")
//	//  성공적으로 되면 후에 실행해
////	@AfterReturning("execution(* com.teogong.concert.Performance.perform(..))")
//	public void applause() {
//		System.out.println("CLAP CLAP CLAP!!!");
//	}
//	
//	@AfterThrowing("performance()")
//	// @AfterThrowing 오류나면 후애 실행
////	@AfterThrowing("execution(* com.teogong.concert.Performance.perform(..))")
//	public void demandRefund() {
//		System.out.println("Demandings refund");
//	}
	
	
	//@Before,@AfterReturning,@AfterThrowing 같이 사용한 @Around
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Sliencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Demandings refund");
		}
	}
}
