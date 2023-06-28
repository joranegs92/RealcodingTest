package Java.입문;

import java.util.List;
import java.util.stream.Collectors;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120886*/
public class A로B만들기 {

	public static int solution(String before, String after) {
		int answer = 0;
		List<String> list = before.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.toList());
		for(int i =0 ;i<after.length();i++){
			String text = String.valueOf(after.charAt(i));
			list.stream().filter(a -> a.equals(text));
		}

		return answer;
	}

	public static void main(String[] args) {

		String before = "olleh";
		String after = "hello";
		solution(before,after);
	}

}
