package com.hanbit.oop.domain;

public class MemberBean {
	private String id, pw, name, ssn; 

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
	public String getSsn() {
		return ssn;
	}
	public String toString(String gender, String age) {
		return "WELCOME " + name + "(" + gender + "," + age + "세)";
	}
}
