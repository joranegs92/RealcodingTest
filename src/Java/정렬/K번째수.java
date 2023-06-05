package Java.정렬;

import java.util.Arrays;
import java.util.stream.Stream;

public class K번째수 {
	public static void main(String[] args){
		int[] a ={1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(a, commands);
	}
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}

		String result = sb.toString();

		for(int i = 0; i< commands.length;i++){

			String b= result.substring(commands[i][0], commands[i][1]);

			char[] charArray = b.toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			System.out.println(sortedString);
			int c = commands[i][2]-1;
			if(sortedString.length() >0) {
				System.out.println(sortedString.charAt(c));
				answer[i] = sortedString.charAt(c);
			}

		}
		System.out.println(answer);

		return answer;
	}
}
