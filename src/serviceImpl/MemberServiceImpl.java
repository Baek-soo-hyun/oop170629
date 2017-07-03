package serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService{
	MemberBean session;
	public MemberServiceImpl() {
		session = new MemberBean();
	}
	@Override
	public String getAge(MemberBean member) {
		int year = Integer.parseInt(member.getSsn().substring(0, 2));
		int age = 0;
		if ((17 - year) >= 0) {
			age = 2017 - (2000 + year) + 1;
		} else {
			age = 2017 - (1900 + year) + 1;
		}
		return String.valueOf(age);
	}

	@Override
	public String getGender(MemberBean member) {
		String gender = "";
		char genderNum = member.getSsn().charAt(7);
		switch (genderNum) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "다시 입력해주세요.";
			break;
		}
		return gender;
	}

	@Override
	public String join(MemberBean member) {
		String result = "회원가입 성공!";
		session = member; 
		return result;
	}

	@Override
	public String login(MemberBean member, MemberBean temp) {
		String login = "", gender = getGender(member), age = getAge(member);
		if (temp.getId().equals(session.getId())) {
			if (temp.getPw().equals(session.getPw())) {
				login = member.toString(gender, age);
			} else {
				login = "비밀번호가 일치하지 않습니다.\n";	
			}
		} else {
			login = "아이디를 확인해주세요.\n";
		}
		return login;
	}

}
