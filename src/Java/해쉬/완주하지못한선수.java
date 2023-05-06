package Java.해쉬;

import java.util.HashMap;
import java.util.HashSet;

public class 완주하지못한선수 {

	public static void main(String[] args){

		String[] participant ={"leo", "kiki", "eden"};
		String[] completion = 	{"eden", "kiki"};

		solution(participant, completion);
	}
	public static String solution(String[] participant, String[] completion) {
		String answer = "";


		HashMap<String, Boolean> hashMap = new HashMap();
		for(int i = 0; i< completion.length ; i++){
			hashMap.put(completion[i],true);
		}
		for(int j =0; j< participant.length;j++){

			hashMap.put(participant[j],hashMap.getOrDefault(participant[j],false));
		}
		System.out.println(hashMap);
		for(String name :hashMap.keySet()){
			if(!hashMap.get(name)){
				answer = name;
				break;
			}

		}

		System.out.println(answer);
		return answer;
	}
}

