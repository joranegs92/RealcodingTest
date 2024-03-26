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
		int end = 1;
		int rslnt = 0;//결과 길이
		int minLength = Integer.MAX_VALUE;
		int size = sequence.length;

		int sum	= 0;
		for(end = 0; end < sequence.length; end++){ // end가 끝까지 갈때까지
			sum += sequence[end];//end를 더해준다
			while(sum > k){//sum이 k보다 클때
				sum -= sequence[start++]; //start를 빼준다
			}
			if( sum == k) { //sum이 k랑 같을때
				if (size > end - start){ //size가 end - start보다 클때
					size = end - start;
					answer[0] = start;
					answer[1] = end;
				}else if( size == end - start){//size가 end - start랑 같을때
					answer[0] = Math.min(answer[0], start);
					answer[1] = Math.min(answer[1], end);

				}
			}
		}

		return answer;
	}

}
//	int sum = 0;

		/*while (true) {
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
		}*/
		/*while (start<=end && end<sequence.length){
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
/*		*/



