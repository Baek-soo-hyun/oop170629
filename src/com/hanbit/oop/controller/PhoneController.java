package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone Phone = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iphone = new IPhone();
		AndroidPhone androidPhone = new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("0.end 1.집전화 2.휴대폰 3.아이폰 4.안드로이드")) {
			case "0" :
				System.out.println("System 종료");
				return;
			case "1" :
				Phone.setName(JOptionPane.showInputDialog("name?"));
				Phone.setPhoneNo(JOptionPane.showInputDialog("phoneNo?"));
				Phone.setBrand(JOptionPane.showInputDialog("brand?"));
				Phone.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, Phone.toString());
				break;
			case "2" :
				nokia.setName(JOptionPane.showInputDialog("name?"));
				nokia.setPortable(true);
				nokia.setPhoneNo(JOptionPane.showInputDialog("PhoneNo?"));
				nokia.setBrand(JOptionPane.showInputDialog("brand?"));
				nokia.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3" : 
				iphone.setName(JOptionPane.showInputDialog("name?"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("PhoneNo?"));
				iphone.setData(JOptionPane.showInputDialog("call message?"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
			case "4" : 
				androidPhone.setName(JOptionPane.showInputDialog("name?"));
				androidPhone.setPhoneNo(JOptionPane.showInputDialog("PhoneNo?"));
				androidPhone.setSize(JOptionPane.showInputDialog("size (inch)"));
				androidPhone.setApp(JOptionPane.showInputDialog("어플명을 입력하세요(ex: 카톡"));
				androidPhone.setData(JOptionPane.showInputDialog("call message?"));
				JOptionPane.showMessageDialog(null, androidPhone.toString());
				break;
			}
		}
	}
}
