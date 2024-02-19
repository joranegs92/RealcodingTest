package Java.프로그래머스new;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12939*/
public class 최댓값과최솟값 {
	public static void main(String[] args) {
		String s =  "-1 -4 2 -3";
		solution(s);
	}
	public static String solution(String s) {
		String answer = "";
		String[] num =s.split(" ");

		String max =num[0];
		String min =num[0];
		for(int i =0;i<num.length;i++){
			int second = Integer.parseInt(num[i]);

			if(Integer.parseInt(max)<second){
				max = num[i];
			}
			if(Integer.parseInt(min)>second){
				min = num[i];
			}
		}
		answer = min +" " + max;
		return answer;
	}
}
