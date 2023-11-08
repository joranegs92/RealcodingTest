package Java.백준;

import java.util.Scanner;

/*https://www.acmicpc.net/problem/2343*/
public class 기타레슨이진탐색 {

	public static void main(String[] args) {
		/*
		 * middle 1 2값 나누기
		 * while로 최저값..
		 * */

		/*
		 * 이 문제에서 이진탐색의 의미는 블루레이 길이를 이진탐색으로 줄여서 탐색하기 위함이다.
		 *
		 * 입력 강의의수 N, 블루레이 갯수 M
		 * 강의 배열 [N]개
		 * for ( 강의의 수 만큼) 입력받기
		 * mid.값 구하기  mid값은 전체 값 다 더해서 반가리한값 = 27
		 *
		 * 첫번째로 가장 짧은값 =9 (1~9까지에서 가장 큰값) 모든수를 더한값 = 최댓값 (1~9 다던한값)
		 * 블루레이에 담을수 있는 가장 작은 값 = 9
		 * 제일 큰값 = 45
		 * 중앙값 = (9 + 45)/ 2
		 * */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //강의의 수
		int M = sc.nextInt(); //블루레이 갯수
		int[] A = new int[N];
		int start = 0;
		int end = 0;


		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (start<A[i]) start = A[i];
			end += A[i];
		}

		while (start<= end){

			int mid = (start+end)/2 ;
			int sum = 0;
			int count = 0;
			for(int i=0; i<N; i++){
				if(sum +A[i]>mid){
					count++;
					sum =0;
				}
				sum =sum+A[i];
			}
			//m = 3
			if(sum !=0) count++;

			if(count>M){
				start = mid+1;
			}else{
				end = mid -1;
			}

		}
		System.out.println(start);
	}
}
