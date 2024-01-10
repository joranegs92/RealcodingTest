package Java.프로그래머스new;

import java.util.ArrayList;

public class 네트워크 {
	static ArrayList<Integer>[] A;
	static boolean[] check;
	public static void main(String[] args) {
		int[][] cp= {{1,1,0},{1,1,0},{0,0,1}};
		solution(3,cp);
	}
	public static void solution(int n, int[][] computers) {
		int answer = 0;
		A = new ArrayList[n];
		check = new boolean[n];
		for (int i=0;i<n;i++){
			if (!check[i]){
				DFS(computers,check,i);
				answer++;
			}
		}
		System.out.println(answer);
	}
		public static void DFS(int[][] computer,boolean[] visited, int start){
			visited[start] = true;
			for (int i=0;i<computer.length;i++){
				if (computer[start][i]==1 && !visited[i]){
					DFS(computer,visited,i);
				}
			}
		}
/*	public static int solution(int n, int[][] computers) {
		int answer = 0;
		A = new ArrayList[n];
		int count = 0;
		check = new boolean[n];
		for (int i=0;i<computers.length;i++){
			A[i] = new ArrayList<>();
			check[i] = false;
		}


		for(int i=0;i<computers.length;i++){
			for (int j=0;j<computers[i].length;j++){
				if (computers[i][j]==1 && i!=j){
					A[i].add(j);
				}
			}
		}
		for (int i=0;i<A.length;i++){
			DFS(i);
			count++;
			System.out.println(A[i]);
		}
		System.out.printf("count : %d\n",count);
		return answer;
	}
	public  static void DFS(int start){
		if (check[0]) return;
		check[0] = true;
		for (int i=0;i<A[0].size();i++){
			int next = A[0].get(i);
			if (!check[next]){
				DFS(start);
			}
		}
	}*/

}
