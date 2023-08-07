package Java.백준.정렬;

/*https://www.acmicpc.net/problem/11399*/

/*삽입정렬
*
* 이전의 원소들과 비교하여 자리를 교환하는 정렬 방법
*
* 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다.(1부터 시작함)
* 2. 타겟이 되는 숫자 이전 위치에 있던 원소보다 작다면 위치를 교환한다.
* 3. 반복
*
* */

/*
* 삽입정렬 푸는법
*
* for(int i = 1 ;i < 길이 ; i++){  <- i는 1 부터 시작한다
*  	while(i 이전 값들 비교 조건 ){
* 	 	오름차순 기준이면
* 		값 비교해서
* 	}
* */

import java.util.Scanner;

public class 삽입정렬1ATM11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		int[] before = new int[N];
		int[] after = new int[N];
		int answer = 0;
		for(int i=0;i<N;i++){
			before[i] = sc.nextInt();
		}

		/*삽입정렬 시작*/

		for(int i=1;i<N;i++){
			//현재 타겟
			int target = before[i];
			//이전 타겟
			int j = i-1;
			//이전타겟이 현재 타겟보다 크면 이동
			while (j>=0 && target <before[j]){
				before[j+1] = before[j];
				j--;
			}
			before[j+1] = target;
		}

		for(int i=0;i<N;i++){
			int j = 0;
			int plus = 0;
			while (j<=i){
				plus += before[j];
				after[i] += before[j];
				j++;
			}
		}

		for(int i=0; i<N;i++){
			answer += after[i];
		}

		System.out.println(answer);
	}

}
