package Java.프로그래머스new;

import java.util.HashSet;

public class 폰켓몬 {

	/*
	* 이 문제는 hashset을 사용해서 중복을 없애고 최대한 많은 수의 컬렉션을 가져가는것.
	* */
	public static void dd(){
		int[] nums = {3,3,3,2,2,2};

	}
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		int answer = 0;
		HashSet<Integer> set = new HashSet();

		for(int i: nums){
			set.add(i);
		}

		if(nums.length/2 < set.size()){
			answer = nums.length;
			System.out.println(nums.length);
		}else{
			answer = set.size();
			System.out.println(set.size());
		}


	}
}
