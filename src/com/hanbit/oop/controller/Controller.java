package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.BMIService;
import com.hanbit.oop.service.BigNumberService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeReport2Service;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.RankingService;
import com.hanbit.oop.service.TaxCalculatorService;
import com.hanbit.oop.service.TopRankingService;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService calcService = new CalcService();
		BigNumberService bigNumberService = new BigNumberService();
		TaxCalculatorService taxCalculatorService = new TaxCalculatorService();
		GradeService gradeService = new GradeService();
		GradeReport2Service gradeReport2Service = new GradeReport2Service();
		RankingService rankingService = new RankingService();
		TopRankingService topRankingService = new TopRankingService();
		BMIService bmiService = new BMIService(); 
		
		while (true) {
			System.out.println("0.stop 1.bmi 2.tax 3.+ 4.- 5o.BigNumber 6.TaxCalculator 7.Time 8.GradeReport2 "
					+ "9.RankingService 10.TopRankingService 11.calcPlus 12.calcMinus 13.grade 14.BMI");
			
			switch (s.next()) {
			case "0":
				System.out.println("stop");
				return;
			case "1":
				System.out.print("Enter your height. (m)\n");
			    double height=s.nextDouble();
			    System.out.print("Enter your weight. (kg)\n");
			    double weight=s.nextDouble();
				String result1 = calcService.calcBMI(height, weight);
				System.out.print(String.format("나의 체중상태는 %s 입니다.", result1));
				break;
			case "2" :
				System.out.println("이름을 입력해주세요.");
				String name = s.next();
				System.out.println("연봉을 입력해주세요. (만원)");
				int salary = s.nextInt();
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

				System.out.println("************************************");
				System.out.println("이름 | 연봉 |   세율   | 납부할 세금");
				System.out.println(String.format("%s | %d 만원 |   %d   | %d 만원", name, salary, (int) (taxRate * 100),
						(int) (salary * taxRate)));
				System.out.println("------------------------------------");
				System.out.println("************************************");
				break;
			case "3" :
				System.out.print("Plus\n");
				System.out.print("첫번째 숫자 입력\n");
				int a = s.nextInt();
				System.out.print("두번째 숫자 입력\n");
				int b = s.nextInt();
				int c = a + b;
				System.out.println("결과:" + c);
				break;
			case "4" :
				System.out.print("Minus\n");
				System.out.print("첫번째 숫자 입력\n");
				int d = s.nextInt();
				System.out.print("두번째 숫자 입력\n");
				int e = s.nextInt();
				int f = d - e;
				System.out.println("결과:" + f);
				break;
				
			case "5" :
				System.out.println("A값을 입력하세요.");
				int g = s.nextInt();
				System.out.println("B값을 입력하세요.");
				int h = s.nextInt();
				System.out.println("C값을 입력하세요.");
				int i = s.nextInt();
				String result2 = bigNumberService.execute(g,h,i);
				
				System.out.println(result2);
				break;
				
			case "6" :
				System.out.println("이름을 입력해주세요.");
				String name1 = s.next();
				System.out.println("연봉을 입력해주세요. (만원)");
				int salary1 = s.nextInt();				
				double taxRate1 = taxCalculatorService.execute(salary1);
				
				System.out.println("************************************");
				System.out.println("이름 | 연봉 |   세율   | 납부할 세금");
				System.out.println(String.format("%s | %d 만원 |   %d   | %d 만원", name1, salary1,
						(int) (taxRate1 * 100), (int) (salary1 * taxRate1)));
				System.out.println("------------------------------------");
				System.out.println("************************************");
				break;
				
			case "7" :
				break;
				
			case "8" :
				System.out.print("Enter Name\n");
				String name2 = s.next();
				System.out.print("Enter Korean\n");
				int kor = s.nextInt();
				System.out.print("Enter English\n");
				int eng = s.nextInt();
				System.out.print("Enter Math\n");
				int math = s.nextInt();
				String result3 = gradeReport2Service.execute(name2, kor, eng, math);
				System.out.print("********************************\n");
				System.out.print("이름       총점   평균   등급   \n");
				System.out.print("--------------------------------\n");
				System.out.print(result3);
				System.out.print("********************************\n");
				break;
				
			case "9" :
				System.out.println("##### 성적 랭킹 #####");
				int[] scores = new int[3];
				String[] names = new String[3];
				for (int index = 0; index < 3; index++) {
					System.out.println("이름을 입력하세요.");
					names[index] = s.next();
					System.out.println("점수를 입력하세요.");
					scores[index] = s.nextInt();
				}
				int[] scoreRanking = rankingService.execute(scores);
				System.out.println("1등: " + names[scoreRanking[0]] + ", 점수: " + scores[scoreRanking[0]]);
				System.out.println("2등: " + names[scoreRanking[1]] + ", 점수: " + scores[scoreRanking[1]]);
				System.out.println("3등: " + names[scoreRanking[2]] + ", 점수: " + scores[scoreRanking[2]]);
				break;
				
			case "10" :
				System.out.println("1반의 총 학생 수는 몇 명?");
				int amount = s.nextInt();
				int[] avgStudent = new int[amount];
				for (int index1 = 0; index1 < avgStudent.length; index1++) {
					System.out.println("학생의 평균 점수를 입력하세요.(100점 만점)");
					avgStudent[index1] = s.nextInt();
				}
				int[] arr = topRankingService.execute(avgStudent, amount);
				System.out.println("1반의 평균 점수는 " + arr[1]);
				System.out.println("최대 점수는 " + arr[2]);
				System.out.println("최소 점수는 " + arr[3]);
				break;
				
			case "11" :
				System.out.print("Plus\n");
				System.out.print("첫번째 숫자 입력\n");
				String first = s.next();
				System.out.print("두번째 숫자 입력\n");
				String second = s.next();
				String resultPlus = calcService.calcPlus(first, second);
				System.out.println(resultPlus);
				break;
				
			case "12" :
				System.out.print("Minus\n");
				System.out.print("첫번째 숫자 입력\n");
				String first1 = s.next();
				System.out.print("두번째 숫자 입력\n");
				String second1 = s.next();
				String resultMinus = calcService.calcMinus(first1, second1);
				System.out.println(resultMinus);
				break;
				
			// controller(main method)에는 최대한 연산자가 없어야 한다. 
			// 객체로만 연산을 하는 것이 객체지향프로그래밍(OOP)이다.
			case "13" :
				System.out.print("이름은?\n");
				String name3 = s.next();
				gradeService.setName(name3);
				System.out.print("전공은?\n");
				String major = s.next();
				gradeService.setMajor(major);
				System.out.print("국어점수?\n");
				int kor1 = s.nextInt();
				gradeService.setKor(kor1);
				System.out.print("영어점수?\n");
				int eng1 = s.nextInt();
				gradeService.setEng(eng1);
				System.out.print("수학점수?\n");
				int math1 = s.nextInt();
				gradeService.setMath(math1);
				gradeService.setGrade();
				System.out.println(gradeService.toString());
				break;
				
			case "14" :
				System.out.println("몸무게를 입력해주세요.");
				double weight1 = s.nextDouble();
				bmiService.setWeight(weight1);
				System.out.println("키를 입력해주세요.");
				double height1 = s.nextDouble();
				bmiService.setHeight(height1);
				bmiService.setBmi();
				bmiService.setComment();
				System.out.println(bmiService.getComment());
				break;
				
			case "15" :
				break;
				
			case "16" :
				break;
			}
		}
	}
}
