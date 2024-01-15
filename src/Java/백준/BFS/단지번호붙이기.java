package Java.백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
				visited[i][j] = false;
			}
		}

		int count =0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && A[i][j] > 0) {
					int size = BFS(i, j);
					count++;
					list.add(size);
				}

			}

		}
		Collections.sort(list);
		System.out.println(count);
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static int BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i, j});
		int count =0;
		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			count++;
			for(int k=0;k<4;k++ ){
				int X= now[0]+dx[k];
				int Y= now[1]+dy[k];

				if (X>=0&& Y>=0 && X<N && Y<N){
					if ( !visited[X][Y] && A[X][Y]>0){
//						if (A[X][Y]>0){
//							A[X][Y] = A[now[0]][now[1]]+1;
//						}
						visited[X][Y] = true;
						queue.offer(new int[]{X, Y});
					}

				}
			}
		}
		return count;
	}
	public static void DFS(int i, int j){

	}
}
