package Java.백준;

import java.util.Arrays;
import java.util.Scanner;
/*https://www.acmicpc.net/problem/1920*/
public class 수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		//정렬
		Arrays.sort(A);

		int M =sc.nextInt();
		for(int i =0; i<M;i++){
			boolean find = false;
			int target = sc.nextInt();
			//이진탐색 시작
			int start =0;
			int end = A.length -1;
			while (start < end){
				int midi = (start + end) /2;
				int midV = A[midi];
				if (midV > target){
					end = midi -1;
				}
				else if(midV == target){
					find = true;
					break;
				}
				else if(midV < target){
					start =midi +1;
				}
			}
			if(find){
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
