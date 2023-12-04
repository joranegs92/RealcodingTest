package Java.프로그래머스new;

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/86491
* */
public class 최소직사각형 {

	public static int solution(int[][] sizes) {
		int answer = 0;
		int maxX= 0; // 가로로 할것 두 배열중에 더 큰게 가로임
		int maxY= 0; //세로임

		for(int i =0; i<sizes.length;i++){

			int x = Math.max(sizes[i][0],sizes[i][1]);
			int y = Math.min(sizes[i][0],sizes[i][1]);
			maxX =Math.max(x,maxX);
			maxY =Math.max(y,maxY);

		}

		return maxX*maxX;
	}
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		solution(sizes);
	}
}
