package com.example.manager;

import com.example.dao.MemberDao;
import com.example.vo.Member;

public class MemberManager {
	
	private MemberDao dao = new MemberDao();
	
	// 회원등록
	public boolean addMember(Member member) {
		if (dao.insertMember(member) > 0) {
			return true;
		}
		return false;
	}
	
	// 회원검색
	
	// 회원수정
	
	// 회원삭제

}
