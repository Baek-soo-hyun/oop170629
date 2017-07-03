package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone {
	public String data;
	public final static String KIND = "스마트폰";
	public final static String BRAND = "아이폰";
	
	public void setData(String data) {
		setPortable(true);
		this.data = data;
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return BRAND + "은 " + KIND + "이기 때문에 " + move + "한 상태로 " + name + "에게 " + phoneNo + "번호로 " +
			BRAND + "을 사용해서 " + data + "라고 문자를 전송했다.";
	}
}
