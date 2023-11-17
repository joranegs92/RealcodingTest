package Java.프로그래머스new;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*
* dfs..로 풀면 시간복잡도가 괜찮은지
* 경우의 수로 계산을 해야함
* 탈출조건
* */

public class 타겟넘버 {
	static boolean[] d;
	static int count;
	static boolean[][] visited;
	static int[][] A; // 데이터저장 2차원배열
	static int N, M;//좌표 끝
	static List<Integer>[] B;
	static int answer = 0;
	static int target;
	static int[] num;
	public static void main(String[] args) {
		num = new int[]{1, 1, 1};

		target = 1;
		dfs(0,0);
	}


	/*
	* 1 1 1 1 1
	* 1 + 1 + 1+ 1+1 x
	* 1 + 1 + 1+ 1 -1 o
	* 1+ 1+1-1-1 x
	*
	* */
	public static void dfs(int index, int sum) {

		if(index == num.length){
			if(sum == target)answer++;
			return;
		}
		dfs(index+1, sum+num[index]);

		dfs(index+1, sum-num[index]);



	}


}
