package Java.정렬;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 가장큰수 {
	public static void main(String[] args) {
		int[] number= {6, 10, 2};
		solution(number);
	}
	public static String solution(int[] numbers) {
		String answer = "";

		ArrayList<String> arrayList2 = new ArrayList<>();

		for(Integer num : numbers){
			arrayList2.add(String.valueOf(num));
		}

		Collections.sort(arrayList2, (a, b) -> (b + a).compareTo(a + b));

		if(arrayList2.get(0).startsWith("0")) return "0";
		System.out.println(answer);
		return answer;

	}
}
