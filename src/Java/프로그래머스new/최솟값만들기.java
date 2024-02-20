package Java.프로그래머스new;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12941*/
public class 최솟값만들기 {
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		solution(A, B);
	}
	public static int solution(int[] A, int[] B){
		int answer = 0;

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0; i<A.length;i++){
			answer+=A[i]*B[B.length-1-i];
		}
		System.out.println(answer);
		return answer;
	}
/*	public static int solution(int[] A, Integer[] B){
		int answer = 0;

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");
		Arrays.sort(A);
		Arrays.sort(B, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				return o2-o1;
			}
		});

		for(int i=0; i<A.length;i++){
			answer+=A[i]*B[i];
		}
		System.out.println(answer);
		return answer;

	}*/
}
