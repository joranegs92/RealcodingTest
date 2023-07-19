package Java.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/2164*/
public class 카드2 {


	public static void main(String[] args)  throws IOException {

		Scanner scanner = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		int n = scanner.nextInt();
		for(int i =1; i<= n ;i++){
			q.add(i);
		}
		while (q.size()>1){
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}

}
