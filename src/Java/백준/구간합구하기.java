package Java.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/11659*/
public class 구간합구하기 {

	/*
	* 문제 풀이 : 두번째 줄의 숫자가 계산할 숫자들이고 세번째부터는 몇번째부터 몇번째까지 구하라는 내용
	* */
	public static void main(String[] args) throws IOException {
		/*입력받기*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());


		/**/
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		System.out.println(n);
		System.out.println(m);

		int[] ns = new int[n];

		/*구간합으로 배열 만들기*/
		StringTokenizer token2 = new StringTokenizer(reader.readLine());
		for(int i=1; i<n ;i++){
			ns[i] = ns[i-1]+Integer.parseInt(token2.nextToken());
			System.out.println(ns[i]);
		}

	}
}
