package com.example.dao;

import java.util.List;

import com.example.vo.Member;

public interface MemberMapper {
	Member selectMemberById (String member_id);
	int insertMember (Member member);			// int로 하면 좋은 점이 있다. 삭제 추가 시 숫자를 표시해줌
	int updateMember (Member meber);
	int deleteMemberById (String member_id);
	List<Member> selectMember (Member member);

}
