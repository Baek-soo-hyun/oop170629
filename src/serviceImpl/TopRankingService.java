package serviceImpl;

public class TopRankingService {
	public int[] execute(int[] avgStudent, int amount) {
		int sum = 0, avg = 0, max = 0, min = 100; // 이것은 배열로 전환
		int[] arr = { sum, avg, max, min };

		// 이번에는 length가 동적인 배열을 선언해야 합니다.
		// 그리고 그 수만큼 for loop이 돌고 점수를
		// 입력 받습니다.
		// 현재는 1등 점수와 꼴찌 점수를 구하는 로직만 구합니다.
		for (int i = 0; i < avgStudent.length; i++) {
			sum += avgStudent[i];
		}
		arr[0] = sum;
		arr[1] = sum / amount;
		
		for (int i = 0; i < avgStudent.length; i++) {
			if (avgStudent[i] > max) {
				max = avgStudent[i];
				arr[2] = max;
			}
		}
		for (int i = 0; i < avgStudent.length; i++) {
			if (avgStudent[i] < min) {
				min = avgStudent[i];
				arr[3] = min;
			}
		}
		
		return arr;
	}
}
