package Java.해쉬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 의상 {

	public static int solution(String[][] clothes) {
		int answer = 0;

		HashMap<String, Integer> map = new HashMap<>();

		for(String[] cloth:clothes){

			map.put(cloth[1],map.getOrDefault(cloth[1],0)+1);
		}

		System.out.println(map);
		System.out.println(map);
		return answer;
	}
	public static void main(String[] args){
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		solution(clothes);
	}

}
