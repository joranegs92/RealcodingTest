package Java.백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/2667*/
public class 단지번호붙이기 {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0,};
	static int[][] A; // 데이터저장 2차원배열
	static boolean[][] visited;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N= Integer.parseInt(st.nextToken());
		A = new int[N][N];
		visited = new boolean[N][N];

		for (int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		BFS(0,0);
	}
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i, j});
		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			for(int k=0;k<4;k++ ){
				int X= now[0]+dx[k];
				int Y= now[1]+dy[k];

				if (X>=0&& Y>=0 && X<N && Y<N){
					if ( !visited[X][Y]){
						if (A[X][Y]>0){
							A[X][Y] = A[now[0]][now[1]]+1;
						}
						visited[X][Y] = true;
						queue.offer(new int[]{X, Y});
					}

				}
			}
		}
	}
}
