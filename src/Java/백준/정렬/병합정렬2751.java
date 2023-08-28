package Java.백준.정렬;

import java.io.*;
import java.util.Scanner;

/*병합정렬  https://www.acmicpc.net/problem/2751*/
public class 병합정렬2751 {
	/* A: 정렬할 배열
	* tmp: 정렬할때 잠시 사용할 임시 배열
	* */
	public static int[] A, tmp;
	public static long result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		A = new int[N+1];
		tmp = new int[N+1];

		for(int i =1; i<=N ;i++){
			A[i] = Integer.parseInt(br.readLine());
		}
		sort(1,N);
		for(int i=1; i <=N ;i++){
			bw.write(A[i] + "\n");
		}
		bw.flush();
		bw.close();

	}

 	private static void sort(int start, int end){
		if(end-start <1) return;

		int middle = start +(end-start)/2;//오버플로우를 방지하기 위함


		System.out.println("middle="+middle);
		System.out.println("start="+start);
		System.out.println("end="+end);
		System.out.println("-------------");


		sort(start, middle);
		System.out.println("middle2="+middle);
		System.out.println("start2="+start);
		System.out.println("end2="+end);

		System.out.println("sortMiddleEnd");
		System.out.println("-------------");

		sort(middle+1, end);

		for(int i =start; i<=end; i++){
			tmp[i] = A[i];
		}

		System.out.println(start+"/"+end+"☆");
		int k =start;
		int index1= start;
		int index2 = middle+1;

		while (index1<=middle && index2 <=end){

			if (tmp[index1] > tmp[index2]){
				A[k] = tmp[index2];
				k++;
				index2++;

			}else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}

		while (index1 <=middle){
			A[k] = tmp[index1];
			k++;
			index1++;
		}

		while (index2<=end){
			A[k] = tmp[index2];
			k++;
			index2++;
		}

	}

}
