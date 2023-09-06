package Java.백준.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*https://www.acmicpc.net/problem/1260*/
public class 백준11724 {
	static ArrayList<Integer>[] A;
	static boolean[] check;
	static int node, line, start;

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());// 현재 4
		line = Integer.parseInt(st.nextToken());//5
		start= Integer.parseInt(st.nextToken());//1


		A = new ArrayList[node+1];
		/*방문배열
			[1][2][3][4]
			[T][T][T][T]
		* */
		check = new boolean[node+1];
		for(int i =1;i<node+1;i++){
			//ArrayList [] [] [] [] 노드 개수만큼 생성
			A[i] = new ArrayList<>();
		}
		//에지 개수만큼 반복하면서 인접리스트에 그래프데이터 저장
		for(int i =1; i<line+1; i++){
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			A[a].add(b);
			A[b].add(a);
			/*
			* [1]- 2 3 4
			* [2]- 1 4
			* [3]- 1 4
			* [4]- 1 2 3
			* 이런식으로 저장
			* */
		}
		DFS(start);
		//n개의 개수만큼 반복하면서 방문하지 않은 노드가 있으면 연결노드개수 ++
		//DFS실행
		//springbuilder에 탐색노드 저장
		sb.append("\n");
		BFS(start);
		System.out.println(sb);


	}
	//node : 4
	// A [1- [2,3,4] 2-[1,4] 3-[1,4] 4-[1,2,3] ]
	public static void DFS(int start){
		check[start] = true; // 방문노드 f-> t
		sb.append(start+" ");
		for(int i: A[start]){
			if(check[i] == false){
				DFS(i);
			}

		}
	}
	// 결과값으로 1234가 나옴. 1 완전탐색  queue 이용
	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		check[node] = false;
		while (!queue.isEmpty()) {
			int nowNode=queue.poll();
			sb.append(nowNode+" ");
			for( int i: A[nowNode]) {
				if (check[i]) {
					check[i] = false;
					queue.add(i);
				}
			}
		}
	}
}
