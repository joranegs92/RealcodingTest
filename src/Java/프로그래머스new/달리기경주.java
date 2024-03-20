package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*https://school.programmers.co.kr/learn/courses/30/lessons/178871*/
public class 달리기경주 {

	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		Map<String, Integer> map = new HashMap<>();
		for(int i= 0; i<players.length;i++ ){
			map.put(players[i],i);
		}
		for(String calling:callings){
			Integer call = map.get(calling);
			System.out.println(call);





		}
		return answer;
	}
/*	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};

		for(int j =0 ; j<callings.length;j++) {

			for (int i = 0; i < players.length; i++) {
				if(players[i].equals(callings[j])){
					String name = players[i-1];
					players[i-1]= callings[j];;
					players[i] = name;

				}
			}
		}
		answer = players;

		return answer;
	}*/
/*	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		Map<String,Integer> map = new HashMap<>();

		int i=0;
		for(String player:players){
			map.put(player,i++);
		}
		for(int j = 0; j<callings.length;j++){
			if(map.containsKey(callings[j])){
				map.put(callings[j],map.getOrDefault(callings[j],0)-1);
			}
		}

		List<Map.Entry<String,Integer>> entry = new ArrayList<>(map.entrySet());
		entry.sort(Map.Entry.comparingByValue());


		for(Map.Entry<String,Integer> entry1: map.entrySet()){
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}

		return answer;
	}*/
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		solution(players, callings);
	}
}
