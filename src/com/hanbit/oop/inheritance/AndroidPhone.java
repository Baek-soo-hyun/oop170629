package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone {
	// Brand 갤럭시 노트
	// data를 오버라이딩 해서 카톡메시지라고 출력시킴
	private String size, app;
	public final static String BRAND = "갤럭시 노트";
	public void setSize (String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApp() {
		return app;
	}
	@Override
	public String toString() {
		return KIND + "이기 때문에 " + move + "한 상태로 " + name + "에게 " + phoneNo + "번호로 " +
			BRAND + size + "인치를 사용해서 " + data + "라고 " + app + "을 전송했다.";
	}
}
