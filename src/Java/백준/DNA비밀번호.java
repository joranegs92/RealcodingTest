package Java.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/12891*/
public class DNA비밀번호 {
	public static void main(String[] args) throws IOException {
	//슬라이딩윈도우문제

		/*
		* 첫번째줄 : 주어질 문자열의 길이, 만들어야할 비밀번호의 길이
		* 두번째줄: 주어질 문자열
		* 세번째줄: A C G T 사용 갯수  예 2 0 1 1 -> A두번 G T 한번 이상
		* */

		/*
		* 예제 1번: CCTGGATTG
		* 사용해야하는| 사용된 총 갯수
		* A C G T |  A C G T
		* 2 0 1 1 |  1 2 3 3
		*
		*
		* 슬라이딩 배열 사용
		* 8개의 슬라이딩배열을 사용하자
		* CCTGGATT -> CTGGATTG
		* A C G T     A C G T
		* 1 2 2 3	  1 1 3 3
		* A가 갯수에 못미쳐 가능한 비밀번호는 0
		* */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int s = Integer.parseInt(st.nextToken()); //주어질 문자열의 길이
		int p = Integer.parseInt(st.nextToken()); // 만들어야할 비밀번호의 길이

		HashMap<Character, int[]> hm = new HashMap<Character,int[]>();

		String S = reader.readLine();
		System.out.println(S);


/*
		for(char c :S){

		}
*/

/*		//배열길이 만들어주기
		String[] S = new String[s];
		int[] P = new int[p];
		int[] j = new int[4]; // A C G T

		String[] acgt = new String[]{"A","C","G","T"};

		//주어질문자열 입력받고 배열에 넣기
		StringTokenizer token = new StringTokenizer(reader.readLine());
		for(int i = 0; i< s; i++){
			S[i] = token.nextToken();
		}
		StringTokenizer token2 = new StringTokenizer(reader.readLine());
		Map<String,int[]> map = new HashMap<>();
		//ACGT와 사용갯수 map에 넣기
		for(int i =0 ; i< 4; i++){
			j[i] = Integer.parseInt(token.nextToken());
			map.put(acgt[i], new int[]{0, Integer.parseInt(token.nextToken())});
		}

		//슬라이딩배열 사용하기
		for(int i=0; i< s-p; i++){


		}*/


	}
}
