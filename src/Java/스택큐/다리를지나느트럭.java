package Java.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나느트럭 {

	public static void main(String[] args){

		int b =2;
		int w = 10;
		int[] truck_weights = {7,4,5,6};
				solution(b,w,truck_weights);

	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int truckin = 0;// 다리에 오른 트럭의 수
		int i = 0; //적재된 트럭의 갯수
		int totalWeight = 0; //올라간트럭들의 무게
		Queue<Integer> q = new LinkedList<>();
		//트럭이 다 적재될때까지
		while(i < truck_weights.length){

			//다리에 아무도 없으면 트럭이 오른다
			if(truckin == 0) {
				q.add(truck_weights[i]);
				totalWeight += truck_weights[i]; //토탈무게 계산
				truckin++; // 다리에 오른 트럭이 한대 늘었음
				i++; // 적재된 트럭도 한대 늘음

				if(q.size() == bridge_length && truckin < bridge_length){
					q.poll();
				}
				answer++;

			}
			// 다리의 길이보다 적재된 트럭이 적고 적재된 트럭들의무게가 괜찮고 앞으로 들어갈 트럭의 무게까지 견디는게 가능하믄 트럭을 다리에 적재

			//1. 올라갈수 있는 트럭의 수 이상 올라가면 더이상 못오른다. && 무게도
			else if(bridge_length > q.size() && totalWeight + truck_weights[i] <= weight){
				q.add(truck_weights[i]);
				totalWeight += truck_weights[i]; //토탈무게 계산
				truckin++; // 다리에 오른 트럭이 한대 늘었음
				i++; // 적재된 트럭도 한대 늘음
				answer++;


			}else if(bridge_length > q.size() && totalWeight + truck_weights[i] > weight){
				q.add(0);
				answer++;
			}
			else if(q.size() == bridge_length){
				truckin--;
				totalWeight -= q.poll();
			}

		}

		return answer+bridge_length;
	}
}
