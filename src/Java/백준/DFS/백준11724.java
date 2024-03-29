package Java.백준.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준11724 {
	static ArrayList<Integer>[] A;
	static boolean[] check;
	static int node, line, start;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		A = new ArrayList[node + 1];
		check = new boolean[node + 1];

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

		// Sort adjacency list for each node
		for (int i = 1; i <= node; i++) {
			Collections.sort(A[i]);
		}

		// Reinitialize check array and Perform DFS
		Arrays.fill(check, false);
		DFS(start);
		sb.append("\n");

		// Reinitialize check array and Perform BFS
		Arrays.fill(check, false);
		BFS(start);
		sb.append("\n");

		System.out.println(sb);
	}

	public static void DFS(int start){
		check[start] = true;
		sb.append(start + " ");
		for (int i : A[start]) {
			if (!check[i]) {
				DFS(i);
			}
		}
	}

	public static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		check[start] = true;

		while (!queue.isEmpty()) {
			int nowNode = queue.poll();
			sb.append(nowNode + " ");

			for (int i : A[nowNode]) {
				if (!check[i]) {
					check[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
