package Java.프로그래머스new;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/176962*/
public class 과제진행하기 {

	public static void main(String[] args) {
		String[][] plans = {{"korean", "11:40", "30"},{"english", "12:10", "20"},{"math", "12:30", "40"}};
		solution(plans);
	}
	//제일 늦게..

	static class Task {
		public Task(String name, int start, int playtime ) {
			this.name = name;
			this.start = start;
			this.playtime  = playtime ;
		}
		private String name; // 과제의 이름

		private int start; // 과제 시작시간
		private int playtime ; // 과제 마치는데 걸리는 시간

	}
	public static String[] solution(String[][] plans) {
		String[] answer = {};
		Queue<Task> queue = new PriorityQueue<>(
				(o1, o2) -> (o1.start-o2.start)
		);
		for(int i =0; i<plans.length;i++){
			String name = plans[i][0];
			String[] parts = plans[i][1].split(":");
			int hour = Integer.parseInt(parts[0]);
			int min = Integer.parseInt(parts[1]);
			int time = (hour * 60) + min;
			int playtime = Integer.parseInt(plans[i][2]);

			queue.add(new Task(name, time, playtime));
		}
		Stack<String> stack = new Stack<>();
		

		while(!queue.isEmpty()){ //queue가 비워질때까지 도는것
			Task tak = queue.poll();
			int time = tak.start;
			int playtime = tak.playtime;
			String name = tak.name;

			if(queue.isEmpty()){ // 새로운과제가 아직 남아있는경우
				Task nestTask = queue.peek();
				//새로운 과제를 시작할 시간이 되었을 때
				if(time + playtime < nestTask.start){

				}
					//기존에 진행중이던 과제가 있을 때
					//기존에 진행중이던 과제가 없을 때
				// 새로운 과제를 시작하려고하는데

			}else {// 과제 안남아있음
				//
			}
		}




		//시간별로

		for(Task element :queue){
			System.out.println(element.name);
		}





		return answer;
	}
}
