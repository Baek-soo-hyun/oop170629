package serviceImpl;

public class GradeReport2Service {
	public String execute(String name, int kor, int eng, int math) {
		// name, kor, eng, math
		// total, avg,
		// 홍길동 : B

		// definition (선언)
		int total = 0, avg = 0;
		String grade = "", result = "";

		// operation(연산)
		total = kor + eng + math;
		avg = total / 3;

		/*
		 * if(avg>=90) { grade = "A"; } else if(avg>=80) { grade = "B"; } else
		 * if(avg>=70) { grade = "C"; } else if(avg>=60) { grade = "D"; } else
		 * if(avg>=50) { grade = "E"; } else { grade = "F"; }
		 */

		switch (avg / 10) {
		case 10:
		case 9:
			result = "장학금 대상입니다.";
			break;
		case 8:
			result = "3학점 이수";
			break;
		case 7:
			result = "2학점 이수";
			break;
		case 6:
			result = "2학점 이수";
			break;
		case 5:
			result = "재수강";
			break;
		default:
			result = "학사 경고";
			break;
		}
		
		String print = String.format("| %s | %d |  %d  |  %s  |\n", name, total, avg, result);
		
		return print;
		// output (출력)

		
	}
}
