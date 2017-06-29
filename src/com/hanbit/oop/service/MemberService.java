package com.hanbit.oop.service;

import java.util.Scanner;

public class MemberService {
	private String id, pw, name, ssn, age, gender, genderNum, login;
	private int year;

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsm() {
		return ssn;
	}
	public void setYear() {
		year = Integer.parseInt(ssn.substring(0, 2));
	}
	public int getYear() {
		return year;
	}
	public void setGenderNum() {
		genderNum = String.valueOf(ssn.charAt(7));
	}
	public String getGenderNum() {
		return genderNum;
	}
	public void setAge() {
		setYear();
		if ((17 - year) >= 0) {
			age = String.valueOf(2017 - (2000 + year) + 1);
		} else {
			age = String.valueOf(2017 - (1900 + year) + 1);
		}
	}
	public String getAge() {
		return age;
	}
	public void setGender() {
		setGenderNum();
		switch (genderNum) {
		case "1":
		case "3":
			gender = "남";
			break;
		case "2":
		case "4":
			gender = "여";
			break;
		case "5":
		case "6":
			gender = "외국인";
			break;
		default:
			gender = "다시 입력해주세요.";
			break;
		}
	}
	public String getGender() {
		return gender;
	}
	public void setLogin(String id, String pw) {
		setAge();
		setGender();
		if (id.equals(this.id)) {
			if (pw.equals(this.pw)) {
				login = toString();
			} else {
				login = "비밀번호가 일치하지 않습니다.\n";	
			}
		} else {
			login = "아이디를 확인해주세요.\n";
		}
	}
	public String getLogin() {
		return login;
	}
	public String toString() {
		return "WELCOME " + name + "(" + gender + "," + age + "세)";
	}
}
