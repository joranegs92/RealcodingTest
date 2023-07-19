package Java.백준;

import java.util.Scanner;
import java.util.Stack;

/* https://www.acmicpc.net/problem/1874 */
public class 스택수열 {
	/*
	* 1 2 5 3 4 일때..
	*
	*
	* */

	/*
	* 8 4 3 6 8 7 5 2 1 일때
	*
	* stack
	* 1 2 3 4	 5 6  7 8   		자연수
	*       4 3    6 	8 7 5 2 1   예제
	*
	* */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();


		int[] A = new int[n];
		for(int i = 0; i<n;i++){
			A[i] = sc.nextInt();
		}
		StringBuilder sb= new StringBuilder();
		boolean test = true;

		int a = 1; // 자연수
		//입력된 수열이 도는동안
		for(int i =0 ; i<n ; i++){

			int s = A[i]; // 입력된 현재수열

			if(s>= a ){ //입력된 수열이 자연수보다 클때는 stack에 자연수가 증가하면서 넣는 동시에 +문자열 만들기
				while (s >= a){
					stack.push(a++);
					sb.append("+\n");

				}
				// 입력된 수열과 자연수가 같을때 stack에서 해당 자연수를 뺀다
				stack.pop();
				sb.append("-\n");


			}
			//입력받은 수열이 자연수보다 작을때  예를들어  4 3 6 8 7 5 2 1 일때 3이 여기로 들어온다.
			else {
				int t = stack.pop(); // 자연수

				if( t > s){ // 자연수 > 현재수열
					/*
					* 1 2 3 4 5   자연수
					* 1 2     5 3 4 입력받은수   3이 오는 시점 자연수는 4 > 입력받은숫자 3 이면 no출력
					* */
					System.out.println("NO");
					test = false;
					break;
				}

				sb.append("-\n");

			}
		}
		if(test) System.out.println(sb);
	}
}
