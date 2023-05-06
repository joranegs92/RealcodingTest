package Java.해쉬;

import java.util.Arrays;
import java.util.HashMap;

public class 전화번호목록 {


	public static void main(String[] args){
		String[] book = {"119", "97674223", "1195524421"};
		//solution(book);
	}
/*	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		System.out.println(Arrays.toString(phone_book));
		Arrays.sort(phone_book);
		System.out.println(Arrays.toString(phone_book));

		for(int i= 0;i<phone_book.length-1; i++){
			System.out.println(phone_book[i+1].startsWith(phone_book[i]));
			if(phone_book[i+1].startsWith(phone_book[i]))
				return false;
		}
		return true;
	}*/

/*	public static boolean solution(String[] phone_book) {

		HashMap<String, Integer> map = new HashMap();
		for(String p:phone_book){
			map.put(p, 1);
		}
		map.containsKey()
		System.out.println(map);
		 return true;
	}*/

}
