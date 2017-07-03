package serviceImpl;


public class RankingService {
	public int[] execute(int[] scores) {
		int[] scoreRanking = new int[3];
		/*
		 * 가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오. 예를 들어, a=4, b=7, c=1을 입력했다면...
		 * 7,4,1이 되겠습니다.
		 */
		if (scores[0] > scores[1] && scores[0] > scores[2]) {
			if (scores[1] > scores[2]) {
				scoreRanking[0] = 0;
				scoreRanking[1] = 1;
				scoreRanking[2] = 2;
			} else {
				scoreRanking[0] = 0;
				scoreRanking[1] = 2;
				scoreRanking[2] = 1;
			}
		}
		if (scores[1] > scores[0] && scores[1] > scores[2]) {
			if (scores[0] > scores[2]) {
				scoreRanking[0] = 1;
				scoreRanking[1] = 0;
				scoreRanking[2] = 2;
			} else {
				scoreRanking[0] = 1;
				scoreRanking[1] = 2;
				scoreRanking[2] = 0;
			}
		} else if (scores[2] > scores[0] && scores[2] > scores[1]) {
			if (scores[0] > scores[1]) {
				scoreRanking[0] = 2;
				scoreRanking[1] = 0;
				scoreRanking[2] = 1;
			} else {
				scoreRanking[0] = 2;
				scoreRanking[1] = 1;
				scoreRanking[2] = 0;
			}
		}
		return scoreRanking;
	}
}
