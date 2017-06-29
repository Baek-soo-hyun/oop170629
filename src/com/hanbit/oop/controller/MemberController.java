package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MemberService memberService = new MemberService();
		while (true) {
			System.out.println("0.end 1.join 2.login");
			switch (s.next()) {
			case "0" :
				System.out.println("System 종료");
				return;
			case "1" :
				System.out.println("이름?");
				String name = s.next();
				memberService.setName(name);
				System.out.println("ID?");
				String id = s.next();
				memberService.setId(id);
				System.out.println("PW?");
				String pw = s.next();
				memberService.setPw(pw);
				System.out.println("SSN?");
				String ssn = s.next();
				memberService.setSsn(ssn);
				System.out.println("회원 가입 성공!");
				break;
			case "2" :
				System.out.println("ID?");
				String loginId = s.next();
				System.out.println("PW?");
				String loginPw = s.next();
				memberService.setLogin(loginId, loginPw);
				System.out.println(memberService.getLogin());
				break;
			}
		}
		
	}

}
