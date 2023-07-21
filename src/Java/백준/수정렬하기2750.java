package Java.백준;

import java.util.Scanner;

/*https://www.acmicpc.net/problem/2750*/
public class 수정렬하기2750 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for(int i =0; i<n;i++){
			A[i] = scanner.nextInt();
		}
		for(int i =0 ;i<n-1 ; i++){
			for (int j =0;j<n-1-i;j++){
				if(A[j]>A[j+1]){
					int t= A[j];
					A[j] = A[j+1];
					A[j+1] = t;
				}
			}
		}
		for(int i = 0; i<n ;i++){
			System.out.println(A[i]);
		}
	}
}
