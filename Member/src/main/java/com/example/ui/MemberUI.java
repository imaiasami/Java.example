package com.example.ui;

import java.util.Scanner;

import com.example.manager.MemberManager;
import com.example.vo.Member;

public class MemberUI {
	
	private MemberManager manager;
	private Scanner scanner;
	
	public MemberUI() {
		manager = new MemberManager();
		scanner = new Scanner(System.in);
		while (true) {
			mainMenu();
			int input = scanner.nextInt()	;
			switch (input) {
			case 1: addMember(); break;
			case 2:
			case 3:
			case 4:
			}
		}
	}
	
	public void addMember() {
		Member member = new Member("Yoo", "홍길동", "1990-01-02", "MALE", "hong@naver.com", "010-1234-5678");
		if (manager.addMember(member)) {
			System.out.println("회원정보 등록 성공");
		} else {
			System.out.println("회원정보 등록 실패");
		}
	}
	
	public void mainMenu() {
		System.out.println("1. 회원등록");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원수정");
		System.out.println("4. 회원삭제");
		System.out.println("선택>");
	}
	
	public static void main(String[] args) {
		new MemberUI();
		
	}

}
