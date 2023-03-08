package com.teogong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teogong.exception.MemberNotFoundException;
import com.teogong.model.Member;

@Component
public class ChangePasswordService {
	
	@Autowired
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
