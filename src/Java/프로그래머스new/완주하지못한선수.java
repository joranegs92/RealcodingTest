package Java.프로그래머스new;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

	/*
	* 단 한명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다 라는 문구에 포인트
	* 1. for문으로 array 정렬후 무조건 한명은 탈락이니 완주자를 기준으로 도전자와 비교해서 이름이 다르면 그 한사람이 무조건 미완주자, for문안에 응답이 없으면 맨 끝사람이 미완주자
	* --> 시간초과 나옴
	*
	* 2.
	* */
//	public static void main(String[] args) {
//
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = { "kiki", "eden"};
//
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		String answer = "";
//
//		for(int i = 0; i<completion.length;i++){
//			if(!completion[i].equals(participant[i])){
//				answer = participant[i];
//				break ;
//			}
//		}
//
//		if(answer == ""){
//			answer = participant[participant.length-1];
//		}
//	}

	/*
	* 해시맵을 사용할것임
	* 중요한 메소드는 getOrDefault  (key, 키가 존재하지 않을경우 반환할 기본 값)
	* map.put(part, map.getOrDefault(part,0)+1); ==> 없으면 1이 기본값으로 들어감.
	*
	* 동명이인 참가자가 여럿 있을수 있음. count는 그를위함
	 * */
	public static void main(String[] args) {

		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = { "kiki", "eden"};

		HashMap<String,Integer> map = new HashMap<>();
		String answer = "";
		for(String part:participant){
			map.put(part, map.getOrDefault(part,0)+1);
		}

		for(String c: completion){
			if(map.get(c) == 1){
				map.remove(c);
			}else {
				System.out.println(map.get(c));
				map.put(c, map.get(c) - 1);
			}
		}
		answer = map.keySet().iterator().next();
	}

	/*
	*
	* */
//	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = { "kiki", "eden"};
//		HashMap<String,Integer> map = new HashMap<>();
//		String answer = "";
//
//	}


}
