package Java.프로그래머스new;

/*https://school.programmers.co.kr/learn/courses/30/lessons/178870*/
public class 연속된수열의합 {
	public static void main(String[] args) {

		int[] sequence = {1,2,3,4,5};
		int k = 7;
		solution(sequence,k);
	}
	public static int[] solution(int[] sequence, int k) {
		int[] answer = {};

		int sum = 0;
		int start = 0;
		int end = 0;

		while (end <= sequence.length) {
			if (sum < k && end < sequence.length) {
				sum += sequence[end++];
			} else {
				if (sum == k) {
					System.out.println(start + " " + end);
					break;
				}
			}
		}

				return answer;

		}

	}
