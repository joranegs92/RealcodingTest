package Java.프로그래머스new;

import java.util.ArrayList;
import java.util.List;

public class 카펫 {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		solution(brown,yellow);

	}
/*	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int size = brown + yellow;
		int width = 0;
		int height = 3; //최소 3 이상
		List<Integer> list = new ArrayList<>();


		return answer;
	}*/
public static int[] solution(int brown, int yellow) {
	int[] answer = new int[2];
	int size = brown + yellow;
	/*int width = 0;
	int height = 3; //최소 3 이상*/
	List<Integer> list = new ArrayList<>();


	for(int i =3; i<size;i++){
		if(size % i == 0){
			list.add(i);
		}
	}
	for(int height :list){
		//int width = (brown -(2*li) + 4)/2;
		int width = size/height;

		if((width-2)*(height-2) == yellow){
			answer[0] = width;
			answer[1] = height;
			break;
		}
/*		if(y<=li && 3<=y){
			System.out.println(y);
			answer[0] = li;
			answer[1] =y;

		}*/
		/*	height = width;
			width = li;
			if(height * width == size){
				answer[0] = width;
				answer[1] = height;
				System.out.println(width);
				System.out.println(height);
				break;
			}*/
	}

	return answer;
}
}
