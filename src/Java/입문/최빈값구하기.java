package Java.입문;

public class 최빈값구하기 {

	public static int solution(int[] array) {
		int answer = 0;
		int max = 0;
		//빈도수 체크
		int plus = 1;
		//빈도수의 값
		int maxNum = array[0];

		for(int i = 1 ; i<= array.length; i++) {
			if(array[i] == array[i-1]){
				plus ++;

				if(plus > max){
					answer= max;
					maxNum = array[i];
				}else if(plus == max){
					maxNum = -1;
				}
			}else {
				plus = 1;
			}
		}
		answer= maxNum;
		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 4, 4	};
		solution(array);
	}
}
