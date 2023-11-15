package Java.프로그래머스new;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 타겟넘버 {
	static boolean[] d;
	static int count;
	static boolean[][] visited;
	static int[][] A; // 데이터저장 2차원배열
	static int N, M;//좌표 끝
	static List<Integer>[] B;
	public static void main(String[] args) {
		int num[] = {1,1,1,1,1};
		int answer = 0;
		B = new ArrayList[num.length];
		for(int i=0;i <num.length;i++){
			B[i] = new ArrayList<>();
			B[i].add(-1);
			B[i].add(+1);

		}


	}


	public static void BFS(int i, int j) {

		/*
		* 어떻게  + -를 만들지 않고...
		*
		* */
	}


}
