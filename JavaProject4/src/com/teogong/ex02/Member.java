package com.teogong.ex02;

public class Member {
	private String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}
