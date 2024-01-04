package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 구명보트 {

	public static void main(String[] args) {
		int[] p = {70, 50, 80, 50};
		solution(p,100);
	}
	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		List<Integer> list = new ArrayList<>();
		int weight=0;//사람무게
		int index=0;

		for (int i=people.length-1;i>=index;i--){
			//list.add(people[i]);
			if (people[i]+people[index]<=limit)	{
				index++;
				answer++;
			}else {
				answer++;
			}
		}


		System.out.println(answer);
		return answer;
	}
}
