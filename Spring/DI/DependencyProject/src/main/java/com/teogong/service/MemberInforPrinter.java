package com.teogong.service;

import com.teogong.model.Member;

public class MemberInforPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	//한사람 출
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}
