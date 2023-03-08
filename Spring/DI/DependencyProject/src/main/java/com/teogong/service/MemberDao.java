package com.teogong.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.teogong.model.Member;

public class MemberDao {
	private static long nextId = 0;

	private Map<String, Member> map = new HashMap<>();
// String email key
	public Member selectByEmail(String email) {
		return map.get(email);
	}
// 아이디 증가
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
// put하는
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	public Collection<Member> selectAll(){
		return map.values();
	}
}
