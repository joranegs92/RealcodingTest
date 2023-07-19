package Java.백준;

import java.util.PriorityQueue;
import java.util.Scanner;

/*https://www.acmicpc.net/problem/11286*/
public class 절댓값힙 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		//절대값을 비교해서 숫자자체가 작은걸 먼저 넣고 그 후에 -인것을 앞 노드로 넣어야한다.
		PriorityQueue<Integer> miniHeap = new PriorityQueue<>((o1, o2) -> {
			int first = Math.abs(o1);
			int second = Math.abs(o2);

			/*comparator안의 0과 1과 -1은 단순히 그 정수값을 의미하는게 아니라 정렬을 의미한다
			* 절대값이 같다면 실제값이 더 큰수에 대해 1을 반환한다. 즉 o1이 o2보다 클때 1을 반환하고 아니면 -1을 반환한다
			* 이는 절대값이 더 작은수가 먼저 반환되어야함을 뜻한다.
			* */
			if(first == second) return o1> o2 ? 1:-1;

			else return first - second;

		});
		for(int i =0 ; i< n ;i++){
			int a = sc.nextInt();
			if(a != 0){
				miniHeap.add(a);
			}else {
				if(miniHeap.size()>0){

					System.out.println(miniHeap.poll());
				}else {
					System.out.println(0);
				}
			}
		}

	}

}

