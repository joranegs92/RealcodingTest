package Java.프로그래머스new;

import java.util.HashSet;

public class 체육복 {
	public static void main(String[] args) {

		solution(5, new int[]{2, 4}, new int[]{ 3});
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		HashSet<Integer> haveStudents = new HashSet<>();
		HashSet<Integer> haventStudents = new HashSet<>();

		for(int i : lost){
			haventStudents.add(i);
		}
		for(int i : reserve){
			haveStudents.add(i);
		}
		for(int i :haveStudents){
			if(haventStudents.contains(i)){
				haveStudents.remove(i);
				haventStudents.remove(i);
				answer++;
			}
			if(haventStudents.contains(i-1)){
				haventStudents.remove(i-1);
				answer++;
			}else if(haventStudents.contains(i+1)){
				haventStudents.remove(i+1);
				answer++;
			}
		}

		return n - haventStudents.size() +haveStudents.size()+ answer;
	}
}
