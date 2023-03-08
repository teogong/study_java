package com.teogong.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.teogong.service.MemberPrinter;
import com.teogong.service.MemberSummaryPrinter;
import com.teogong.service.VersionPrinter;

// @Configuration 설정 클래스다라고 알려주는 것 
@Configuration
@ComponentScan(basePackages = {"com.teogong" }, 
				excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {
				AppConf1.class, AppConf2.class, AppConfImport.class }))
public class AppCtx {

	// 호출하 MemberDao객체를 얻음 , @Bean 객체를 관리해줘~~~~
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}

//	디페젼시 인젝션을 해줌 
//	@Bean
//	public MemberRegisterService memberRegSvs() {
//		return new MemberRegisterService();
//	}

	// @Bean
//	2) @Bean
//	• 스프링은 객체를 생성하고 초기화 하는 기능을 제공
//	• 스프링이 생성하고 관리하는 객체를 Bean 객체라 함
//	• 객체를 생성하고 리턴하는 메소드에 @Bean annotation 을 설정하면 해당 메소드가 생성한 객체를 스프링이 관리하는 Bean 객체로 등록함
//	해당 메소드의 이름은 생산한 Bean 객체의 식별자로 사용(memberDao, memberRegSvc, changePwdSvc)

	// DI 동일한 타입의 객체를 스프링은 하나만 유지 싱클톤 패턴
//	@Bean
//	public ChangePasswordService changePwdSvc() {
//		ChangePasswordService pwdSvc = new ChangePasswordService();
////		pwdSvc.setMemberDao(memberDao());
//		return pwdSvc;
//	}

//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}

	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}

	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}

//	@Bean
//	public MemberListPrinter listPrinter() {
//		return new MemberListPrinter();
//	}

//	@Bean
//	public MemberInforPrinter infoPrinter() {
//		MemberInforPrinter infoPrinter = new MemberInforPrinter();
////		infoPrinter.setMemberDao(memberDao());
////		infoPrinter.setPrinter(memberPrinter());
//		return infoPrinter;
//	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(34);
		versionPrinter.setMinorVersion(77);
		return versionPrinter;
	}
}
