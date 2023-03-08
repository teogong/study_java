package com.teogong.service;

import com.teogong.exception.MemberNotFoundException;
import com.teogong.model.Member;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	
	// 비번 변경 메소드 
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();

		member.changePassword(oldPwd, newPwd);

		memberDao.update(member);
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
