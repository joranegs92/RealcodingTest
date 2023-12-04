package Java.프로그래머스new;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

	public static int solution(String numbers) {
		int answer = 0;
		Set<Integer> hashSet = new HashSet<>();
		test("",numbers,hashSet);
		/*
		* 소수 구하기 = 2 랑 3만 나눠보기
		* */

/*		for(int i = 0; i< numbers.length();i++){
			String num = String.valueOf(numbers.charAt(i));
			System.out.println(num);
		}*/

		return answer;
	}
	public static void test(String test,String num,Set<String> set){
		for(int i = 0;i<num.length();i++){
			String newTest = test+ num.charAt(i);
			String newTest2 = num.substring(0,i)+num.substring(i+1);
			System.out.println(newTest);
			System.out.println(newTest2);
			test(newTest,newTest2,test);
		}
	}
	public static void main(String[] args) {
		String num = "173";
		solution(num);
	}
}
