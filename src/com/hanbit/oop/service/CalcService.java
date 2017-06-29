package com.hanbit.oop.service;

import java.util.Scanner;

import sun.net.www.content.text.plain;

public class CalcService {
	public String calcBMI(double height, double weight) {
		System.out.print("BMI=weight/(height*height)\n");
		double bmi = weight / (height * height);
		System.out.print(String.format("나의 체질량지수(BMI): %f \n", bmi));
		String result = "";
		if (20.0 >= bmi) {
			result = "비만";
		} else if (bmi >= 25.0) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}
	
	public String calcPlus(String a, String b) {
		return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
	}
	public String calcMinus(String a, String b) {
		return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
	}
	public String calcMuti(String a, String b) {
		return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
	}
	public String calcDivid(String a, String b) {
		return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
	}
	public String clacTax(String a, String b) {
		String result = "";
		return result;
	}
	public String calcTime(String a, String b) {
		String result = "";
		return result;
	}
}
