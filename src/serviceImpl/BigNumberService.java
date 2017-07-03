package serviceImpl;

public class BigNumberService {
	public String execute(int a, int b, int c) {
		String result = "";
		/*
		가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오.
		예를 들어, a=4, b=7, c=1를 입력했다면 "7,4,1"이 되겠습니다.
		*/		
		
		if(a>=b) {
			if(b>=c) {
				result = "a, b, c";
			}
			else if(b<c) {
				if(b>c) {
					result = "a, c, b";
				}
				else if(a<c) {
					result = "c, a, b";
				}	
			}
		}
		else if(a<b) {
			if(a>=c) {
				result = "b, a, c";
			}
			else if(a<c) {
				if(b>c) {
					result = "b, c, a";
				}
				else if(b<c) {
					result = "c, b, a";
				}
			}
		}
		return result;
	}
}
