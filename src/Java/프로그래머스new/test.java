package Java.프로그래머스new;

import java.util.Scanner;

public class test {
	static String[] seatarr = {"1-1", "1-2", "1-3", "1-4", "1-5"};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sel2 = scanner.next();

		for(int j=0; j<seatarr.length; j++) {
			String selseat = seatarr[j];

			if (sel2.equals(selseat)) {
				System.out.println("예매 가능합니다. 예매 하시겠습니까?");
			}

			else{
				System.out.println("예매 불가능 합니다. ");
			}


		}
	}
}
