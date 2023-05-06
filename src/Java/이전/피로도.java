package Java.이전;

public class 피로도 {

	public static int answer = 0;
	public static boolean[] visit;

	public static int solution(int k, int[][] dungeons) {

		visit = new boolean[dungeons.length];

		// 최댓값
		int max = 0;
		DFS(k, dungeons, max);

		return answer;
	}
	public static void DFS(int k, int[][] dungeons, int max) {
		answer = Math.max(answer,max);

		for (int i = 0; i < dungeons.length; i++) {
			System.out.println("i="+i);
			System.out.println("k="+k);
			if(!visit[i] && dungeons[i][0] <= k) {
				System.out.println("dungeon"+dungeons[i][0]);
				visit[i] = true;
				DFS(k - dungeons[i][1], dungeons, max+1);
				System.out.println("reset"+max);
				visit[i] = false;
			}
		}
	}
	public static void main(String[] args) {

		int k=80; //피로도
		int[][] dungeons = {{80,20},{50,40},{30,20}};
		solution(k,dungeons);
	}
}
