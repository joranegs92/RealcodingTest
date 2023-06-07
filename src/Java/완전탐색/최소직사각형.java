package Java.완전탐색;

public class 최소직사각형 {
	public static int solution(int[][] sizes) {
		int answer = 0;
		int max_a = 0;
		int max_b = 0;
		for(int i = 0 ;i<- sizes.length; i++){
			int maxA = Math.max(sizes[i][0],sizes[i][1]);
			int min = Math.min(sizes[i][0],sizes[i][1]);

			max_a = Math.max(max_a,maxA);
			max_b = Math.max(max_b,min);

		}
		System.out.println(max_a*max_b);

		return max_a*max_b;
	}

	public static void main(String[] args) {
		int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		solution(size);
	}
}
