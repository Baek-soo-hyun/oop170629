package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public int getAvg(GradeBean gradeBean);
	public String getGrade(int avg);
}
