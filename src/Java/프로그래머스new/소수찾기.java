package Java.프로그래머스new;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

	public static int solution(String numbers) {
		int answer = 0;
		Set<Integer> hashSet = new HashSet<>();
		test("",numbers,hashSet);
		int count = 0;
		for(int num : hashSet){
			if(check(num)){
				count++;
			}
		}
		/*
		* 소수 구하기 = 2 랑 3만 나눠보기
		* */

/*		for(int i = 0; i< numbers.length();i++){
			String num = String.valueOf(numbers.charAt(i));
			System.out.println(num);
		}*/
		System.out.println(count);
		return answer;
	}
	public static boolean check(int num ){
		if(num <=1){
			return false;
		}
		for(int i=2;i*i<=num; i++){
			if(num % i ==0) return false;
		}
		return true;
	}
	public static void test(String test,String num,Set<Integer> set){
		if(!test.isEmpty()){
			set.add(Integer.parseInt(test));
		}
		for(int i = 0;i<num.length();i++){

			test(test+num.charAt(i),num.substring(0,i)+num.substring(i+1),set);
		}
	}
	public static void main(String[] args) {
		String num = "17";
		solution(num);
	}
}
