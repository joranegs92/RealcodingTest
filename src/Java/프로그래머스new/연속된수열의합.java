package Java.프로그래머스new;

/*https://school.programmers.co.kr/learn/courses/30/lessons/178870*/
public class 연속된수열의합 {
	public static void main(String[] args) {

		int[] sequence = {1, 1, 1, 2, 3, 4, 5};
		int k = 5;
		solution(sequence,k);
	}
	public static int[] solution(int[] sequence, int k) {
		int[] answer =  {-1, -1};


		int start = 0;
		int end = 0;
		int rslnt = 0;//결과 길이
		int minLength = Integer.MAX_VALUE;
		int sum = 0;

		while (true) {
			if (sum >= k) {//총합이 k보다 크거나 같을때
				System.out.println(minLength);
				if(sum == k && end - start < minLength){ //총합이 k랑 같고 길이가 더 짧을때
					minLength = end - start;
					answer[0] = start;
					answer[1] = end;

				}
				sum -= sequence[start++];
			} else {//총합이 k보다 작을때
				if(end == sequence.length) break;
				sum += sequence[end++];
			}
		}
		return answer;
	}

}

/*		while (end<sequence.length){
			int sum = 0;
			for(int i =start;i<=end;i++){
				sum += sequence[i];
				if(sum < k){
					end++;

				}else if(sum > k){
					start++;
				}else if(sum == k){
					if(rslnt< end- start){
						rslnt = end - start;
						answer[0] = start;
						answer[1] = i;
						break;
					}
				}
			}
		}*/



