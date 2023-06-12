package com.example.vo;

public class Board {
	private int board_id;
	private String title;
	private String content;
	private String input_date;
	private String update_date;
	private int hit;
	private Member member;
	private String member_id;

	//기본 생성자
	
	public Board () {
		
	}
	
	// 사용자 정의2(title, content, member_id) 생성자
	public Board (String title, String content, String member_id) {
		this.title = title;
		this.content = content;
		this.member_id = member_id;
	}
	
	// 사용자 정의(title, content, member) 생성자
	public Board (String title, String content, Member member) {
		this.title = title;
		this.content = content;
		this.member = member;
		
	}
	
	// getter, setter, toString

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInput_date() {
		return input_date;
	}

	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	@Override
	public String toString() {
		return "Board [board_id=" + board_id + ", title=" + title + ", content=" + content + ", input_date="
				+ input_date + ", update_date=" + update_date + ", hit=" + hit + ", member=" + member + "]";
	}

	
}
