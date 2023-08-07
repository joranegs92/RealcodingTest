package Java.백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/11004*/
public class 퀵정렬K번째수11004 {

	/*
	* pivot을 정한다. (기준값)
	* */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(in.readLine());
		int[] c= new int[a];
		for(int i = 0;i<a;i++){
			c[i] = Integer.parseInt(st.nextToken());
		}
	}
	public static void quickSort(int arr[],int l, int r){
		if(l < r) { //left가 right보다 작아야한다.

			int p = partition(arr,l,r);

		}
	}
	static int partition(int arr[], int l, int r){
		int pivot = arr[r];
		return 2;
	}
}
