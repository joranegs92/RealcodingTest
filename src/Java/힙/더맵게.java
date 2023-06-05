package Java.힙;

import java.util.PriorityQueue;

public class 더맵게 {
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		System.out.println(K);
		PriorityQueue<Integer> heap = new PriorityQueue();

		for (int sk : scoville) {
			heap.offer(sk);
		}

		System.out.println(heap);
		while (heap.peek() <= K) {

			int a = heap.poll();
			int b = heap.poll();


			int result = a + (b * 2);

			System.out.println(heap);
			heap.offer(result);
			answer ++;
		}
		System.out.println(heap);
		return answer;
	}
	public static void main(String[] args){
		int[] sc = {1,2,3,9,10,12};
		int k= 7;
		더맵게.solution(sc, k);
	}
}
