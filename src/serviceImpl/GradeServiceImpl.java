package serviceImpl;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService {
	public int getAvg(GradeBean gradeBean) {
		return (gradeBean.getKor() + gradeBean.getEng() + gradeBean.getMath())/3;
	}
	public String getGrade(int avg) {
		String grade = "";
		switch (avg / 10) {
		case 10:
			grade = avg + "A학점 : 장학금 대상입니다.";
			break;
		case 9:
			grade = avg + "A학점 : 장학금 대상입니다.";
			break;
		case 8:
			grade = avg + "B학점 : 3학점 이수";
			break;
		case 7:
			grade = avg + "C학점 : 2학점 이수";
			break;
		case 6:
			grade = avg + "D학점 : 2학점 이수";
			break;
		case 5:
			grade = avg + "E학점 : 재수강";
			break;
		default:
			grade = avg + "F학점 : 학사 경고";
			break;
		}
		return grade;
	}
}
