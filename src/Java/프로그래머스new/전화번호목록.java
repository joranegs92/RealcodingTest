package Java.프로그래머스new;

import java.util.HashMap;
import java.util.HashSet;

public class 전화번호목록 {

	/*
	*
	* */
	public static void main(String[] args) {
		String[] pon = {"119", "97674223", "1195524421"};
		HashMap<String, Boolean> map = new HashMap<>();
		boolean test = true;
		for (String phone : pon) {
			map.put(phone, true);
		}
		for (String phone : pon) {
			for (int i = 0; i < phone.length(); i++) {
				String prefix = phone.substring(0, i);
				if (map.containsKey(prefix)) {

					test = false;
				}
			}
		}
		System.out.println(test);


	}
}
