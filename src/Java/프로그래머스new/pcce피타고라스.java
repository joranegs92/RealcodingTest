package Java.프로그래머스new;

import java.util.Scanner;

public class pcce피타고라스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();

		int b_square = (int) (Math.pow(c,2) - Math.pow(a,2));

		System.out.println(b_square);
	}


}
