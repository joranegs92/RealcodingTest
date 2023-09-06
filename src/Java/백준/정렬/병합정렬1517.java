package Java.백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병합정렬1517 {
	public static int answer;
	public static int[] A,tmp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		A = new int[N+1];
		tmp = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++){
			A[i]=Integer.parseInt(st.nextToken());
		}
		answer = 0;
		sort(1,N);
		System.out.println(answer);
	}
	public static void sort(int start , int end){
		if(end-start <1) return;
		int middle = start+(end-start)/2;

		sort(start, middle);
		sort(middle+1,end);

		for(int i =start; i<=end;i++){
			tmp[i] = A[i];
		}

		int k = start;
		int index1= start;
		int index2 = middle+1;
		while (index1<=middle && index2 <=end){

			if (tmp[index1] > tmp[index2]){
				A[k] = tmp[index2];
				answer = answer+ index2 - k;
				k++;
				index2++;


			}else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}

		while (index1 <=middle){
			A[k] = tmp[index1];
			k++;
			index1++;
		}

		while (index2<=end){
			A[k] = tmp[index2];
			k++;
			index2++;
		}

	}
}

