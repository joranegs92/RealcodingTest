package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.List;

/*https://school.programmers.co.kr/learn/courses/30/lessons/70129*/
public class 이진변환하기 {
	public static void main(String[] args) {
		solution("110010101001");
	}
	public static int[] solution(String s) {
		int[] answer = {};
		String ss ="";
		int countzero =0; //
		int binaryConut = 0;
		List<Integer> integerList = new ArrayList<>();
		for (int i =0; i<s.length();i++){
			integerList.add(Integer.parseInt(s.substring(i)));
		}
		while (true){
			int insiceConut =0;
			binaryConut++;

			for (int i =0;i<s.length();i++){

				if(s.charAt(i)== '1'){
					ss+=s.charAt(i);

				}else {
					insiceConut++;

				}
			}
			ss = Integer.toBinaryString(Integer.parseInt(ss));
			if(insiceConut<1){
				break;
			}
		}

		return answer;
	}
}
