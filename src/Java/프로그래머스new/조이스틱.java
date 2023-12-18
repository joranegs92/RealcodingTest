package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.List;

public class 조이스틱 {
	public static void main(String[] args) {

		solution("AAAAAA");
	}
	public static int solution(String name) {
		String alpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int answer = 0;

		List<String> al = new ArrayList<>();
		for(int i = 0; i<name.length() ;i++){
			al.add(String.valueOf(name.charAt(i)));
		}

		int beforeNum = 0;
		int move = name.length()-1;

		for(int i =0; i<name.length();i++){
			//int targetNum = alpabet.indexOf(name.charAt(i));
			answer += Math.min(name.charAt(i) - 'A','Z'-name.charAt(i)+1);



			int next = i+1;
			while (next< name.length() && name.charAt(next)=='A'){
				next++;
			}



			move = Math.min(move,i+name.length() - next + Math.min(i,name.length() - next));
			System.out.println(move);
		//	System.out.println(Math.min(targetNum - alpabet.indexOf("A"),alpabet.indexOf("Z")-targetNum+1));

			//System.out.println(alpabet.indexOf("Z")-targetNum+1);
			//Math.min(alpabet.indexOf("A")targetNum)

		}
		answer += move;
		System.out.println( answer);
/*		while (al.isEmpty()){
			//Z, A면 무조건 1만 이동함
			//

			if()

		}*/
		return answer;
	}
}
