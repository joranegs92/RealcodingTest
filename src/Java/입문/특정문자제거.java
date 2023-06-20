package Java.입문;

public class 특정문자제거 {
	public static String solution(String my_string, String letter) {
		String answer = "";

		for(int i =0 ; i< my_string.length(); i++){


		}
		System.out.println(my_string.indexOf("f"));
		System.out.println(my_string.replace("letter",""));
		return my_string.replace("f","");
	}

	public static void main(String[] args) {
		String myString = "abcdef";
		String letter = "f";

		solution(myString, letter);

	}

}
