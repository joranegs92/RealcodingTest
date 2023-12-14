package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.List;

public class 조이스틱 {
	public static void main(String[] args) {

		solution("JEROEN");
	}
	public static int solution(String name) {
		String alpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int answer = 0;

		List<String> al = new ArrayList<>();
		for(int i = 0; i<name.length() ;i++){
			al.add(String.valueOf(name.charAt(i)));
		}

		int beforeNum = 0;
		for(String a :al){
			int targetNum = alpabet.indexOf(a);

			//System.out.println(Math.min(targetNum - alpabet.indexOf("A"),alpabet.indexOf("Z")-targetNum+1));

			System.out.println(alpabet.indexOf("Z")-targetNum+1);
			//Math.min(alpabet.indexOf("A")targetNum)

		}
/*		while (al.isEmpty()){
			//Z, A면 무조건 1만 이동함
			//

			if()

		}*/
		return answer;
	}
}
