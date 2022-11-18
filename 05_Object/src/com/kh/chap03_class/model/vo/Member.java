package com.kh.chap03_class.model.vo;

public class Member {
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public void changeName(String Name) {
		memberName = Name;
	}
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}

}
