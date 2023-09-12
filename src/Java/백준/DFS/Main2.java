package Java.백준.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2 {
	static ArrayList<Integer>[] A;
	static boolean[] check;
	static int node, line ;
	static int answer;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());

		A = new ArrayList[node + 1];
		check = new boolean[node + 1];

		Arrays.fill(check, false);

		for (int i = 1; i <= node; i++) {
			A[i] = new ArrayList<>();
		}


		for (int i = 1; i <= line; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			A[a].add(b);
			A[b].add(a);
		}

		for (int i = 1; i <= node; i++) {
			Collections.sort(A[i]);
		}
		answer = 0;

		/// ++

		for(int i =1;i<=node;i++){
			if(!check[i]){
				DFS(i);
				answer++;
			}
		}
		System.out.println(answer);
	}
	public static void DFS(int start){
		if(check[start]) return;
		check[start] = true;

		for(int i:A[start]){
			if(!check[i]){
				DFS(i);
			}
		}

	}
}
