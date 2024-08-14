package Java.프로그래머스new.입문;

public class 암호해독 {
	static public String solution(String cipher, int code) {
		String answer = "";
		System.out.println(cipher.length());
		for (int i = code; i <= cipher.length(); i += code) {
			String concat = cipher.substring(i - 1, i);
			System.out.println(concat);
		answer+= concat;
		}
		System.out.println(answer);
		return answer;
	}


	public static void main(String[] args) {
		solution("pfqallllabwaoclk",2);
	}
}
