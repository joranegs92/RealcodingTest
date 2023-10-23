package Java.백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/2468*/
public class 안전영역 {

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0,};

	static boolean[][] visited;
	static int[][] A; // 데이터저장 2차원배열
	static int N; //물 수위 행과 열

	static int count; //물에 잠기지않는 영역을 카운트하기위함

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		N = Integer.parseInt(br.readLine());
		A = new int[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {

				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		BFS(0,0);
		System.out.println(count);

	}
	public static void BFS(int i, int j) {
		Queue<int[]> queue =new LinkedList<>();
		queue.add(new int[] {i, j});
		visited[i][j] = true;

		while (!queue.isEmpty()){
			int now[] = queue.poll();
			for(int k =0; i<4; i++){
				int x = now[0] +dx[k];
				int y = now[1] + dy[k];
				if(x>=0 && y>= 0 && x<N && y<N){
					if(A[x][y] >N && !visited[x][y]){
						visited[x][y] = true;
						count++;
						queue.add(new int[]{x,y});
					}
				}
			}
		}

	}
}
