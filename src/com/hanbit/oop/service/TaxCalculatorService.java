package com.hanbit.oop.service;

public class TaxCalculatorService {
	public double execute(int salary) {
		
		double taxRate = 0;

		if (salary <= 1200) {
			taxRate = 0.08;
		} else if (salary <= 4600) {
			taxRate = 0.17;
		}
		if (salary <= 8800) {
			taxRate = 0.26;
		}
		if (salary > 8800) {
			taxRate = 0.35;
		}

		return taxRate;
	}
}
