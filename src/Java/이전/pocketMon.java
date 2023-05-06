package Java.이전;

import java.util.HashSet;

public class pocketMon {
	public static int solution(int[] nums){
		int answer = 0;
		int max = nums.length/2;

		HashSet<Integer> hashSet = new HashSet<>();

		for(int num : nums){
			hashSet.add(num);
		}

		if(hashSet.size() > max ){
			answer = max;
		}else{
			answer = hashSet.size();
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args){
		int[] nums = {3,3,3,2,2,2};
		solution(nums);
	}
}
