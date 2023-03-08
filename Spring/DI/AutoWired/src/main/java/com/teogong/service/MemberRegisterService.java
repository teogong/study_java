package com.teogong.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teogong.exception.DuplicateMemberException;
import com.teogong.model.Member;

@Component
public class MemberRegisterService {
	// MemberRegisterService에는 MemberDao객체가 필요하다.
	// MemberRegisterService는 MemberDao가 Dependency
	// MemberRegisterService는 MemberDao를 의존한다.
//	private MemberDao memberDao = new MemberDao();
	// 문제는 MemberDao객체를 변경하면 MemberRegisterService이것도 변경하는 문제 발생
	// 객체지향은 변경해야 될 부분과 안되는 부분을 나누어야 하기 때문!!

	// Dependency Injection 외부에서 주입 받는 형식으로 만들어야한다.
	@Autowired
	private MemberDao memberDao;

	public MemberRegisterService() {

	}

	public MemberRegisterService(MemberDao memberDao) {

		this.memberDao = memberDao;
	}

	// 등록이라는 메소드 만듬
	public long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		// 멤버 있냐 없냐 찾아
		if (member != null) {
			// 멤버 중복되었다.
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}
		// null이라면 멤버를 집어넣고 새로운 멤버에 id리턴 해
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
