package Java.프로그래머스new;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12951*/
public class JadenCase {
	public static void main(String[] args) {
		String s = "    ";
		solution(s);
	}
	public static String solution(String s) {
		String answer = "";

		String[] d = s.split(" ");

		for (int i=0; i<d.length; i++){
			String result = "";

			if(!Character.isUpperCase(d[i].charAt(0))){
				result= d[i].substring(0,1).toUpperCase()+d[i].substring(1).toLowerCase();
			}
			answer+= result+" ";
		}

		return answer.substring(0, answer.length()-1);
	}
}
