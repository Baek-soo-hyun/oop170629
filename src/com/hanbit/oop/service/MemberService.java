package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public class MemberService {
	MemberBean session; // RAM은 공간만 만들어 놓고 연산은 하지 않는다. (절대 opcode가 없다.)
	MemberBean temp;
	public MemberService() {
		session = new MemberBean();
		temp = new MemberBean();
		// session은 이전 login Id/PW 정보를 저장하기 위함
	}
	
	public String getAge(MemberBean member) {
		int year = Integer.parseInt(member.getSsn().substring(0, 2));
		int age = 0;
		if ((17 - year) >= 0) {
			age = 2017 - (2000 + year) + 1;
		} else {
			age = 2017 - (1900 + year) + 1;
		}
		return String.valueOf(age);
	}
	public String getGender(MemberBean member) {
		String gender = "";
		char genderNum = member.getSsn().charAt(7);
		switch (genderNum) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "다시 입력해주세요.";
			break;
		}
		return gender;
	}
	public String join(MemberBean member) {
		String result = "회원가입 성공!";
		// session에 회원가입시 입력한 정보를 저장하는 소스
		session = member; 
		// 객체지향 (객체로 "주소"값을 전달하고 받는다. 객체 자체를 똑같이 카피해둔다. 
		// But, 값 copy가 아니라서 member가 바뀌면 session이 갱신된다.)
		return result;
	}
	
	public String login(MemberBean member, MemberBean temp) {
		String login = "", gender = getGender(member), age = getAge(member);
		if (temp.getId().equals(session.getId())) {
			if (temp.getPw().equals(session.getPw())) {
				login = member.toString(gender, age);
			} else {
				login = "비밀번호가 일치하지 않습니다.\n";	
			}
		} else {
			login = "아이디를 확인해주세요.\n";
		}
		return login;
	}
}
