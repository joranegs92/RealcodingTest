package Java.입문;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120836*/
public class 순서쌍의개수 {

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1;i <= n; i++){
			if(n%i == 0) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 20;
		solution(n);
	}
}
