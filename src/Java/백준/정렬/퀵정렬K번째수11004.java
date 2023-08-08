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
		int a = Integer.parseInt(st.nextToken()); //배열길이
		int b = Integer.parseInt(st.nextToken()); //구해야할 k번째 수

		st = new StringTokenizer(in.readLine());
		int[] c= new int[a];
		for(int i = 0;i<a;i++){
			c[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(c,0,a-1);
	}
	public static void quickSort(int arr[],int l, int r){
		if(l < r) { //left가 right보다 작아야한다.

			int p = partition(arr,l,r);
			quickSort(arr,l,p-1);
			quickSort(arr,p,r);
		}
	}
	static int partition(int arr[], int l, int r){
		int pivot = arr[l];
		int lo = l;
		int hi = r;
		while(lo < hi) {

			/*
			 * hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를
			 * 찾을 떄 까지 hi를 감소시킨다.
			 */
			while(arr[hi] > pivot && lo < hi) {
				hi--;
			}

			/*
			 * hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를
			 * 찾을 떄 까지 lo를 증가시킨다.
			 */
			while(arr[lo] <= pivot && lo < hi) {
				lo++;
			}

			// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
			swap(arr, lo, hi);
		}
		swap(arr,l,r);

		return lo;
	}
	static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
