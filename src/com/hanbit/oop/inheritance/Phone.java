package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNo, brand, call;
	public final static String KIND = "집전화";

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	public String toString() {
		return getName() + "에게 " + getPhoneNo() + "번호로 " + getBrand() + KIND + "를 사용해서 " + getCall() + "이라고 통화했다.";
	}
}
