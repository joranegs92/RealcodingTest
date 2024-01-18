package Java.프로그래머스new;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 *
 * */
public class 붕대감기 {
	public static void main(String[] args) {
		int[] bandage = {1,3,2,5,4};
		int health = 5;
		int[][] attacks = {{1,5},{2,2},{2,3}};
		solution(bandage,health,attacks);
	}
	public static int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		int[] check = new int[bandage.length];
		for (int i=0;i<attacks.length;i++){
			for (int j=attacks[i][0]-1;j<attacks[i][1];j++){
				check[j] = 1;
			}
		}
		for (int i=0;i<check.length;i++){
			if (check[i]==0){
				answer += bandage[i];
			}
		}


		System.out.println(answer);
		return answer;
	}

}
