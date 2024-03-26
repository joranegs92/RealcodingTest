package Java.프로그래머스new;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {

	/*https://school.programmers.co.kr/learn/courses/30/lessons/176963*/
	public static void main(String[] args) {
		String[] name ={"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		solution(name, yearning, photo);
	}
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String,Integer> map = new HashMap<>();
		for (int i=0;i<name.length;i++){
			map.put(name[i],yearning[i]);
		}
		int i=0;
		for(String[] po: photo){

			int sum =0;
			for(String p:po){
				if(map.containsKey(p)){
					sum+= map.get(p);
				}
			}
			answer[i] = sum;
			i++;

		}

		return answer;
	}
}
