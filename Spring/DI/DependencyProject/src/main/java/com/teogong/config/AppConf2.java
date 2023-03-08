package com.teogong.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teogong.service.ChangePasswordService;
import com.teogong.service.MemberDao;
import com.teogong.service.MemberInforPrinter;
import com.teogong.service.MemberListPrinter;
import com.teogong.service.MemberPrinter;
import com.teogong.service.MemberRegisterService;
import com.teogong.service.VersionPrinter;

@Configuration
public class AppConf2 {
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberPrinter memberprinter;

	@Bean
	public MemberRegisterService memberRegSvs() {
		return new MemberRegisterService(memberDao);
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
		return pwdSvc;
	}


	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberprinter);
	}

	@Bean
	public MemberInforPrinter infoPrinter() {
		MemberInforPrinter infoPrinter = new MemberInforPrinter();
		infoPrinter.setMemberDao(memberDao);
		infoPrinter.setPrinter(memberprinter);
		return infoPrinter;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(34);
		versionPrinter.setMinorVersion(77);
		return versionPrinter;
	}
}
