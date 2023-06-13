package Java.입문;

public class 최빈값구하기 {

	public static int solution(int[] array) {
		int answer = 0;
	/*	//이전수
		int before = array[0];*/
		//빈도수
		int count = 1;
		for(int i =0 ; i< array.length;i++){
			if(array[i] == array[i-1]) {
				System.out.println(array[i]);

			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4	};
		solution(array);
	}
}
