package Java.입문;

import java.util.*;

public class 배열뒤집기 {

	public static int[] solution(int[] num_list) {

		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for(int i =0 ; i< num_list.length; i++){
			list.add(num_list[i]);
		}

		Collections.reverse(list);
		answer = new int[list.size()];
		for(int i =0 ; i< list.size(); i++){
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		solution(num);
	}
}
