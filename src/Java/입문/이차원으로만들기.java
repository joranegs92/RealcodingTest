package Java.입문;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120842*/
public class 이차원으로만들기 {

		public static int[][] solution(int[] num_list, int n) {
			int[][] answer = new int[num_list.length/n][n];
			int count = 0;
			for(int i= 0;i< num_list.length/n; i++){
				for(int j =0; j< n; j++){
					answer[i][j] = num_list[count];
					count++;
					System.out.println(answer[i][j]);
				}
			}

			return answer;
		}


	public static void main(String[] args) {
		int[] num = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n = 3;
		solution(num,n);
	}
}
