package Java.프로그래머스new;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12924*/
public class 숫자의표현 {
	public static void main(String[] args) {
		int n = 15;
		solution(n);
	}
	public static int solution(int n){
		int answer = 0;
		for(int i =0; i<=n;i++){
			int sum = 0;
			for(int j= i; j<n;j++){
				sum += j;
				if(sum == n){
					answer ++;
					break;
				}

			}
		}

		return answer;
	}
}
