package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

import serviceImpl.GradeServiceImpl;

public class GradeController {
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		GradeBean grade = new GradeBean(); 
		while (true) {
			switch (JOptionPane.showInputDialog("0.stop 1.grade")) {
			case "0" :
				System.out.println("System 종료");
				return;
			case "1" :
				grade.setName(JOptionPane.showInputDialog("name?"));
				grade.setMajor(JOptionPane.showInputDialog("major?"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor?")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("math?")));
				
				JOptionPane.showMessageDialog(null, gradeService.getGrade(gradeService.getAvg(grade)));
				break;
			}
		}
	}
}
