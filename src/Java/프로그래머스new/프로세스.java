package Java.프로그래머스new;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로세스 {
	public static void main(String[] args) {
		int[] priority = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int answer = 0;
		Queue<int[]> queue = new LinkedList<>();
		for(int i= 0; i<priority.length;i++){

			queue.add(new int[]{priority[i],i});
		}
		while (!queue.isEmpty()){
			int[] q = queue.poll();
			int qx = q[0];
			if(queue.stream().anyMatch(x -> x[0]>qx)){
				queue.add(q);

			}else {
				answer++;
				if(q[1]==location){
					break;
				}
			}
		}
		System.out.println(answer);
/*		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i= 0; i<priority.length;i++){

			q.add(priority[i]);
		}
		for(int i= 0; i<priority.length;i++){

			System.out.println(q.poll());
		}*/

	}
}
