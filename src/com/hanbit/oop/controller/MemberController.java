package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

import serviceImpl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		MemberBean memberBean = new MemberBean();
		while (true) {
			switch (JOptionPane.showInputDialog("0.end 1.join 2.login")) {
			case "0" :
				System.out.println("System 종료");
				return;
			case "1" :
				// setter
				memberBean.setName(JOptionPane.showInputDialog("name?"));
				memberBean.setId(JOptionPane.showInputDialog("ID?"));
				memberBean.setPw(JOptionPane.showInputDialog("PW?"));
				memberBean.setSsn(JOptionPane.showInputDialog("SSN?"));
				JOptionPane.showMessageDialog(null, memberService.join(memberBean));
				break;
			case "2" :
				MemberBean temp = new MemberBean();
				temp.setId(JOptionPane.showInputDialog("ID?"));
				temp.setPw(JOptionPane.showInputDialog("PW?"));
				JOptionPane.showMessageDialog(null, memberService.login(memberBean, temp));
				break;
			}
		}
		
	}

}
