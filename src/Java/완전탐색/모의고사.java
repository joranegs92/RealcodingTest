package Java.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
	public static int[] solution(int[] answers) {

		int[] score =new int[3];
		List<Integer> list = new ArrayList<>();
		int[] first = {1,2,3,4,5};
		int[] second = {2,1,2,3,2,4,2,5};
		int[] third = {3,3,1,1,2,2,4,4,5,5};

		for(int i =0; i<answers.length; i++){
			if(answers[i] == first[i%5]) score[0]++;
			if(answers[i] == second[i%8]) score[1]++;
			if(answers[i] == third[i%10]) score[2]++;

		}
		//score에 있는 답변대로 순서 만들기
		int max = Math.max(Math.max(score[0], score[1]),score[2]);

		if(max == score[0]) list.add(1);
		if(max == score[1]) list.add(2);
		if(max == score[2]) list.add(3);
		int[] answer = new int[list.size()];
		int i =0;
		for(int li:list){
			answer[i] = li;
			i++;
		}


		System.out.println(list.size());
		System.out.println(Arrays.toString(score));
		System.out.println(list);
		System.out.println(max);
		return answer;
	}

	public static void main(String[] args) {
		int[] answer = {1,2,3,4,5};
		solution(answer);

	}
}
