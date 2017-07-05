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
		findById(updateMember.getId()).setPw(updateMember.getPw());;
	}

	@Override
	public void delete(String id) {
		for (int i=0 ; i<memberList.length ; i++) {
			if (id.equals(memberList[i].getId())) {
				// memberList[i] = memberList[i+1]; -> 뒤에서 한 칸씩 당기는 방법(1억 명일 때, 안티패턴)
				memberList[i] = memberList[i-1]; // 순서 상관 없이 맨 마지막에 있는 회원을 i번째에 바꿔치기 하는 방법(성능 높음)
				break;
			}
		}
		memberList[count-1] = null;
		count--;
	}
}
