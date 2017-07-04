package serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	int count;
	MemberBean member;
	MemberBean[] memberList;
	public AdminServiceImpl(int limit) {
		member = new MemberBean();
		memberList = new MemberBean[limit];
		count = 0;
	}

	@Override
	public void addMember(MemberBean member) {
		memberList[count] = member;
		count++;
	}

	@Override
	public MemberBean[] getMembers() {
		return memberList;
	}

	@Override
	public int counterMembers() {
		return count;
	}

	@Override
	public MemberBean findById(String id) {
		member = new MemberBean(); // 상단에 선언함으로써 일단 공간은 1개 만들어 놓고 여기서는 new로 깨끗하게 치워서 재활용 가능
		for(int i=0;i<memberList.length;i++) {
			if(id.equals(memberList[i].getId())) {
				member = memberList[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int count = 0; 
		for(int i=0 ; i<memberList.length ; i++) {
			if(name.equals(memberList[i].getName())) {
				count++;
			}
		}
		MemberBean[] temp = new MemberBean[count];
		int j = 0;
		for(int i=0 ; i<memberList.length ; i++) {
			if(name.equals(memberList[i].getName())) {
				temp[j] = memberList[i];
				j++;
			}
			if(count == j) {
				break; // ** j개를 찾으면 더이상 for를 돌릴 필요가 없으니까 beak를 해줘야 함 (이게 고수의 능력!)
			}
		}
		return temp;
	}

	@Override
	public void updatePw(MemberBean updateMember) {
		String id = updateMember.getId();
		findById(id).setPw(updateMember.getPw());;
	}
}
