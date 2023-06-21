package Java.입문;

public class 배열의유사도 {

	/*https://school.programmers.co.kr/learn/courses/30/lessons/120903*/
	public static int solution(String[] s1, String[] s2) {
		int answer = 0;

		for(int i = 0; i <s1.length;i++){
			for(int j = 0; j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		solution(s1,s2);
	}
}
