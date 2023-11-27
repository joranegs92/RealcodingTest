package Java.프로그래머스new;


import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {

	static int[] dx ={0,1,0,-1};
	static int[] dy ={1,0,-1,0};
	static int[][] maps;
	static boolean[][] visited = new boolean[5][5];
	static int answer =0;
	public static void main(String[] args) {

		maps= new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};
		answer = bfs(0,0);

		System.out.println(answer);
	}
	public static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0,0});
   		visited[i][j] = true;


		while (!queue.isEmpty()){
			int now[] = queue.poll();//현재 방문한곳
			for(int k=0;k<4;k++){
				int x =now[0]+dx[k];
				int y =now[1]+dy[k];
				if(x>=0 && y>=0 && x<5 && y<5){
					if(maps[x][y] !=0 && !visited[x][y]){
						System.out.println(maps[x][y]);
						visited[x][y] =true;
						maps[x][y] = maps[now[0]][now[1]]+1;
						queue.add(new int[]{x,y});
					}
				}
			}
		}

		return maps[4][4] >2 ? maps[4][4] : -1;
	}
}
