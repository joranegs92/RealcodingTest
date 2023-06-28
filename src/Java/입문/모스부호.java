package Java.입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120838*/
public class 모스부호 {

	public static String solution(String letter) {
		String answer = "";
		String space = "";
		List<String> list = new ArrayList<>();

		String[] morse = {
				".-","-...","-.-.","-..",".","..-.",
				"--.","....","..",".---","-.-",".-..","--","-.",
				"---",".--.","--.-",".-.","...","-","..-","...-",
				".--","-..-","-.--","--.."
				};

		String[] morseSpace = letter.split(" ");
		System.out.println(Arrays.toString(morseSpace));
		for(int i =0 ;i< morseSpace.length; i++) {
			for(int j = 0; j< morse.length; j++){
				
			}
		}

				/*
				for(int i =0; i<letter.length() ;i++ ){
					System.out.println(letter.charAt(i));
					String lt = String.valueOf(letter.charAt(i));

					if(!lt.equals("")){
						list.add(lt);

					}else{
						list.isEmpty();
					}
				}*/

		return answer;
	}

	public static void main(String[] args) {
		String mos = ".... . .-.. .-.. ---";
		solution(mos);
	}
}
