package Java.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* https://www.acmicpc.net/problem/1940 */
public class backjun1940 {

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());

		int[] nBox = new int[n];


		StringTokenizer token = new StringTokenizer(reader.readLine());

		for (int i = 0; i <n ;i++){
			nBox[i] = Integer.parseInt(token.nextToken());
		}
		//정렬
		Arrays.sort(nBox);
		int count = 0;
		int i =0;
		int j = n-1;
		while (i<j){
			if(nBox[i]+nBox[j]<m) {
				i++;
			} else if(nBox[i]+nBox[j]>m){
				j--;
			} else if(nBox[i]+nBox[j] == m){
				count++;
				i++;
				j--;
			}
		}

		System.out.println(count);


	}

}
