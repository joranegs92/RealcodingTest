package Java.프로그래머스new;

import java.util.*;

public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		 solution(numbers);
	}
	public static String solution(int[] numbers) {
		String answer = "";

		List<String> list = new ArrayList<>();
		for(int num :numbers){
			list.add(String.valueOf(num));
		}

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				System.out.println("o1="+o1+",o2="+o2+"dd"+(o2+o1).compareTo(o1+o2));

				System.out.println((o1+o2).compareTo(o2+o1));
				return (o2+o1).compareTo(o1+o2);
			}
		});
		StringBuilder sb = new StringBuilder();


		return null;
	}
}
