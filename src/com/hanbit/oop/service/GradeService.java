package com.hanbit.oop.service;
// "static"이 있는 main method(Controller)만 외부에 공개된다.
// "static"이 없는 Service 같은 것은 지금은 화면에 보이지만 나중에 배포하면 인간이 읽을 수 없는 언어로 Encrypt 된다.

// 소스 코드는 HDD에 저장되고 있지만
// main method(controller) new 하고 Service를 객체화 하는 순간 HHD에 있던 Service가 RAM(가상 공간)에 불려와서 올려지고
// Service의 method가 실행(call) 되는 순간 CPU가 작동하면서 연산을 하고
// controller의 main method(static 정적인 real 공간)에 값이 전달되 순간, 값이 HDD에 저장됨 (노출됨)

// controller에서 input 값을 입력 받아, Service의 setter method(ex: setKor)에 전달하면, method를 call해서 전달하면,
// Service의 setter method(ex: setKor)가 private
// setter method가 field의 property(ex: private in kor)에 결과 값을 매칭시켜서(전달해서) RAM에 값을 저장해두면
// Service의 method가 field의 property값을 가지고 연산하고,
// 그 결과 값을 Controller에서 넘겨받아서 다른 말로 바꿔서(ex: 85kg -> "과체중입니다.") 바뀐 값을 화면에 출력한다.
// Getter Method는 field의 property의 값을 외부에 리턴해주는 역할을 함 

public class GradeService {
	// field (필드) = information Hiding -> RAM (보안화)
	private int kor, eng, math, total, avg; // instance의 변수 = property / 다음 연산을 위해 잠깐 값을 저장해주는 공간
	private String grade, name, major;
	// private는 외부에서 절대 뚫리지 않음
	
	
	// SETTER : 쓰기 전용
	public void setKor(int kor) { // int kor :  method area에 있는 변수는 지역 변수
		this.kor = kor;
		// this는 이 필드에 있는 (not area)
		// 이 메서드 area는 return이 없어서 값을 그대로 가지고 있음 (return을 해버리면 내 값을 전달함=나는 값이 없음) 
	}
	public void setEng(int eng) {
		this.eng = eng; 
	}
	public void setMath(int math) {
		this.math = math; 
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}
	public void setAvg() {
		this.avg = total/3;
	}
	
	// GETTER : 읽기 전용 (보안성 강화) / parameter가 필요 X
	public int getKor() { // 읽기 전용, 데이터 값을 저장할 수 없음
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}

	// Method area = CPU (연산)
	public void setGrade() {
		setTotal();
		setAvg();
		switch (avg / 10) {
		case 10:
		case 9:
			grade = "A학점 : 장학금 대상입니다.";
			break;
		case 8:
			grade = "B학점 : 3학점 이수";
			break;
		case 7:
			grade = "C학점 : 2학점 이수";
			break;
		case 6:
			grade = "D학점 : 2학점 이수";
			break;
		case 5:
			grade = "E학점 : 재수강";
			break;
		default:
			grade = "F학점 : 학사 경고";
			break;
		}
	}
	public String getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public String toString() {
		return "==================================\n"
				+ "이름    전공    성적\n"
				+ "----------------------------------\n"
				+ name + "\t" + major + "\t" + grade + "\n";
	}
}
