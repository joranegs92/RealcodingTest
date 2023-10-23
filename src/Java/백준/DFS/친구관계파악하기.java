package Java.백준.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/13023*/
public class 친구관계파악하기 {

	static int N,M;//사람수 & 친구 관계 수
	static ArrayList<Integer>[] A;
	static int deps;
	static Map<Integer,Boolean> map = new HashMap<Integer,Boolean>(); //5댑스 노드까지
	static int arrive; //5뎁스까지 갔으면 1 아직이면 0



	public static void main(String[] args) throws IOException {
	//대체 문제가 뭘말하는지모르겠음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine()); // 사람수
		M = Integer.parseInt(br.readLine());//관계수
		A = new ArrayList[N];


		for(int i =0; i<N;i++){
			A[i] = new ArrayList<Integer>();
		}

		//
		for(int i =0; i<M ; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			A[a].add(b);
			A[b].add(a);
		}
		//
		for(int i =0; i<=4;i++){
			map.put(i,false);
		}

		arrive = 0;
		for(int i=0;i<N;i++){
			DFS(i);
		}


	}

	//deps가 5이상??
	public static void DFS(int start){
		map.put(start,true);

		if(start == 5 && arrive == 1){
			for(int s: A[start]){
				DFS(start);
			}
		}

	}

}
