package com.example.vo;


public class Member {
	
	private String member_id;
	private String name;
	private String birth;
	private String gender;
	private String email;
	private String phone;
	
	public Member() {
		super();
	}				// 기본 생성자는 필요하다.

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + "]";
	}

	public Member(String member_id, String name, String birth, String gender, String email, String phone) {
		super();
		this.member_id = member_id;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	
	
	

}
