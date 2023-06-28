package Java.백준;

import java.util.Scanner;

/*https://www.acmicpc.net/problem/1546*/
public class 평균 {

	/*
	* 세준이의 기적의 셈법
	* (점수a / 최고점수 * 100) + (점수b /최고점수 * 100) + (점수c/최고점수 * 100)
	* = (점수 a+b+c..) * (최고점수 * 100)
	*
	* 배열에 점수를 입력
	* 1. 점수중 가장 큰 수를 구한다
	* 2. 점수를 모조리 더한다
	* 3. 위의 계산식으로 더한다.
	* */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i= 0; i< n;i++){
			a[i] = sc.nextInt();
		}
		int max = 0;
		int total = 0;
		for(int z = 0; z<n; z++){
			if(max < a[z]){
				max = a[z];
			}
			total += a[z];
		}

		System.out.println(max);
		System.out.println(total / max *100);
	}
}
