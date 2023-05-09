package Java.스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

/*	public static int[] solution(int []arr) {
		int[] answer = {};
		answer = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(answer));
		return answer;
	}*/
public static int[] solution(int []arr) {
	int[] answer = {};
	List<Integer> list = new ArrayList<>();

	int test= -1;
	for(int n : arr) {
		if(test != n) list.add(n);
		test = n;
	}
	System.out.println(list);
	return answer;
}
	public static void main(String[] args){
		int []arr={1,1,3,3,0,1,1};
		solution(arr);
	}
}
