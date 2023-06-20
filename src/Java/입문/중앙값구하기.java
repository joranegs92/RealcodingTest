package Java.입문;

import java.util.Arrays;

public class 중앙값구하기 {

	public static int solution(int[] array) {
		int answer = 0;
		//정렬
		Arrays.sort(array);
		System.out.println(array[array.length/2]);

		return answer;
	}

	public static void main(String[] args) {
		int[] array = {9,-1,0};
		solution(array);
	}
}
