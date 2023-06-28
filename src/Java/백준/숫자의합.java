package Java.백준;

/*https://www.acmicpc.net/problem/11720*/

import java.util.Scanner;

/*
* 문제
* N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
*
* */
public class 숫자의합 {
	public static int test(){

		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		int ex = 54321;
		//정수 100까지밖에 입력이 불가능
		String test = Integer.toString(ex);
		char[] ch = test.toCharArray();

		for(int i =0; i<ch.length; i++){
			// char to  int
			answer += ch[i] -'0';
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
	test();
	}
}

/*	public static int test(){
		int answer = 0;

		return answer;
	}

	public static void main(String[] args) {

	}
	*/
