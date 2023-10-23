package Java.백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/2178*/
public class 미로탐색 {

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0,};
	static boolean[][] visited;
	static int[][] A; // 데이터저장 2차원배열
	static int N, M;//좌표 끝

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited = new boolean[N][M]; //방명록 남기기
		A = new int[N][M];

		//데이터저장하기 ~~ 2차원배열로~~
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		BFS(0, 0);

	}

	public static void BFS(int i, int j) {

		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[]{i, j});
		visited[i][j] = true;

		//갈곳없을때까지 계속 돌고돌고
		while (!queue.isEmpty()) {
			//현재 탐색하고 있는 위치
			int now[] =queue.poll();
			for(int k =0; k<4; k++){
				int x =now[0] + dx[k];
				int y =now[1] + dy[k];

				if(x>=0 && y>=0 && x<N && y<M){
					//탐색하는 곳이 0일때 빠꾸, 이미 방문한곳이면 안감
					if(A[x][y] !=0 && !visited[x][y]){
						System.out.println(A[x][y]);
						visited[x][y] = true;
						//해당위치에 얼마나 왔는지 값을 더한다
						/*
						* 1 0 1 1
						* 2 0 1 1
						* 3 0 1 1
						* */
						A[x][y] = A[now[0]][now[1]]+1;
						//탐색한곳을 queue로 등록함
						queue.add(new int[]{x,y});
					}
				}
			}
		}

	}


}
