package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

import serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		AdminService adminService = new AdminServiceImpl();
		// MemberBean member = new MemberBean();
		MemberBean member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.exit 1.add 2.count 3.list 4.findById 5.findByName 6.updatePw 7.delete")) {
			case "0" :
				return;
			case "1" :
				member = new MemberBean();
				// MemberBean member = new MemberBean();
				String[] arr = JOptionPane.showInputDialog("Name/Id/Pass/SSN").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				adminService.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, adminService.counterMembers());
				break;
			case "3" :
				String result = "";
				MemberBean[] memberList = adminService.getMembers();
				for(int i=0 ; i<adminService.counterMembers() ; i++) {
					result += (memberList[i].toString() + "\n");
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case "4" :
				MemberBean result1 = adminService.findById(JOptionPane.showInputDialog("찾고 싶은 id를 입력하세요.")); // id는 유일한 1개라서 returnType이 MemberBean
				if(result1 == null) {
					JOptionPane.showInputDialog("찾는 id 정보가 없습니다.");
				} else {
					JOptionPane.showMessageDialog(null, result1.toString());	
				}
			case "5" :
				String result2 = "";
				MemberBean[] temp = adminService.findByName(JOptionPane.showInputDialog("찾고 싶은 name을 입력하세요.")); // name은 중복 가능해서 returnType이 MemberBean[]
				if(temp.length == 0) {
					result2 = "찾는 이름이 없습니다.";
				} else {
					for (int i=0 ; i<temp.length ; i++) {
						result2 += temp[i].toString();
					}
				}
				JOptionPane.showMessageDialog(null, result2);
				break;
			case "6" :
				MemberBean updateMember = new MemberBean(); // pw는 보안사항이라서 bean에 담아서 param 전달
				updateMember.setId(JOptionPane.showInputDialog("가입했던 id를 입력하세요."));
				updateMember.setPw(JOptionPane.showInputDialog("새로운 pw 입력하세요."));
				adminService.updatePw(updateMember);
				JOptionPane.showMessageDialog(null, "비밀번호 변경 완료");
				break;
			case "7" :
				adminService.delete(JOptionPane.showInputDialog("삭제할 id를 입력해주세요."));
				JOptionPane.showMessageDialog(null, "회원 삭제 완료");
				break;
			}	
		}
	}
}
