package Java.프로그래머스new;

/*zz*/
public class pcce가채점 {
	public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
		int num_student = numbers.length;
		String[] answer = new String[num_student];

		for (int i = 0; i < num_student; i++) {
			if (our_score[i] == score_list[numbers[i]-1]) {
				answer[i] = "Same";
			}
			else {
				answer[i] = "Different";
			}
		}

		return answer;
	}
}
