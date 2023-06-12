package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.vo.Member;

public class MemberDao {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// 회원정보 검색
	public Member selectMemberById(String member_id) {
//			String name = session.selectOne("selectMemberById", "kim");
//			System.out.println(name);
		try (SqlSession session = factory.openSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			Member selectMember = mapper.selectMemberById(member_id);
			System.out.println(selectMember);
			return selectMember;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// 회원정보 검색_2
	public void selectMember(Member member) {
		try (SqlSession session = factory.openSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			List<Member> selectMember = mapper.selectMember(member);
			System.out.println("selectMember : " + selectMember);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원정보 등록
	public int insertMember(Member member) {
		try (SqlSession session = factory.openSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			int result = mapper.insertMember(member);
			session.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 회원정보 수정
	public void updateMember() {
		try (SqlSession session = factory.openSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			Member member = selectMemberById("hong");
			if (member != null) {
				member.setName("홍길순");
				member.setBirth("2000-01-01");
				int result = mapper.updateMember(member);
				System.out.println("result : " + result);

			}
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원정보 삭제
	public void removeMember() {
		try (SqlSession session = factory.openSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			int result = mapper.deleteMemberById("Park");
			System.out.println("result : " + result);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
//		dao.selectMemberById("hong");
//			dao.insertMember(new Member ("ehd299", "홍길동", "1995-05-20", "FEMALE", "ehd299@naver.com", "010=7279-2118"));
//			dao.updateMember();
//			dao.removeMember();
		Member member = new Member();
		member.setName("홍길동");
//		member.setGender("FEMALE");
		dao.selectMember(member);
	}

}
