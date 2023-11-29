package Java.프로그래머스new;

import java.util.PriorityQueue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42626*/
public class 더맵게 {
	public static int solution(int[] scoville, int K) {

		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for(int sc:scoville) {
			heap.add(sc);
		}
		int scov = 0;
		while (heap.size()>1 && heap.peek() < K){
			System.out.println("scov"+scov);
			System.out.println("heep"+heap.peek());
			int first = heap.poll();
			int second = heap.poll();
			scov= first +(second * 2);
			heap.add(scov);
			answer++;

		}
		if(heap.peek() < K){
			return -1;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] sc ={0, 0, 3, 9, 10, 12};
		int k = 7;
		solution(sc , k);
	}

}
