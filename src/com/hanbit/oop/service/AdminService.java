package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member); // setter
	public MemberBean[] getMembers(); // getter
	public int counterMembers(); // getter
	public MemberBean findById(String id); // 변형 getter
	public MemberBean[] findByName(String name);
	public void updatePw(MemberBean member);
}
