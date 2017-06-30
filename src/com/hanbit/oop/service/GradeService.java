package com.hanbit.oop.service;
// "static"이 있는 main method(Controller)만 외부에 공개된다.
// "static"이 없는 Service 같은 것은 지금은 화면에 보이지만 나중에 배포하면 인간이 읽을 수 없는 언어로 Encrypt 된다.

import com.hanbit.oop.domain.GradeBean;

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
	public int getAvg(GradeBean gradeBean) {
		return (gradeBean.getKor() + gradeBean.getEng() + gradeBean.getMath())/3;
	}
	public String getGrade(int avg) {
		String grade = "";
		switch (avg / 10) {
		case 10:
			grade = avg + "A학점 : 장학금 대상입니다.";
			break;
		case 9:
			grade = avg + "A학점 : 장학금 대상입니다.";
			break;
		case 8:
			grade = avg + "B학점 : 3학점 이수";
			break;
		case 7:
			grade = avg + "C학점 : 2학점 이수";
			break;
		case 6:
			grade = avg + "D학점 : 2학점 이수";
			break;
		case 5:
			grade = avg + "E학점 : 재수강";
			break;
		default:
			grade = avg + "F학점 : 학사 경고";
			break;
		}
		return grade;
	}
}
