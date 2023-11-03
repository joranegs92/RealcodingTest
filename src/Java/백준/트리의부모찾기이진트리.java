package Java.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/11725*/
public class 트리의부모찾기이진트리 {
	static int N;
	static boolean[] visit;
	static int answer[];
	//static ArrayList<Integer> tree; /* 이렇게 하면 tree에는 {1,2,3} 인거고  */
	static ArrayList<Integer> tree[]; /* 이렇게 하면 tree에는 tree[0].[0] tree[1][y] 으로 들어감 */

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		visit = new boolean[N+1];
		tree = new ArrayList[N+1];
		answer = new int[N+1];
		for(int i = 0; i<N;i++){
			tree[i] = new ArrayList<>();
		}
		for(int i =0; i<N;i++){
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			tree[n1].add(n2);
			tree[n2].add(n1);
		}
		DFS(1);
	}
	public static void DFS(int start) {
		visit[start] = true;
		for(int i: tree[start]){
			if(!visit[i]){
				answer[i] = start;
				DFS(i);
			}

		}
	}

}
