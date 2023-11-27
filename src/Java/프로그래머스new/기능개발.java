package Java.프로그래머스new;

import java.lang.reflect.Array;
import java.util.*;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progress = {93, 30, 55};
		int[] speeds = {1,30,5};
		int[] answer = {};


		Queue<Integer> q =new LinkedList<>();
		for(int i =0; i<progress.length;i++){
			int time = (100-progress[i]+speeds[i]-1) / speeds[i];
			q.add(time);
			System.out.println(time);
		}

		List<Integer> array = new ArrayList<>();
		while (!q.isEmpty()){
			int count = 0;
			int day = q.poll();
			count++;

			while (!q.isEmpty() && q.peek() <= day){
				q.poll();
				count++;
			}
			array.add(count);
		}
		 answer = array.stream().mapToInt(i->i).toArray();
	}
}
