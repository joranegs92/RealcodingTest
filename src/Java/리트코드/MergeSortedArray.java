package Java.리트코드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150*/
public class MergeSortedArray {
	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list1 = new ArrayList<>();



		for(int i=0;i<m;i++){
			list1.add(nums1[i]);

		}
		for (int i=0;i<n;i++){
			list1.add(nums2[i]);
		}
		Collections.sort(list1);

		nums1 = new int[list1.size()];
		for (int i=0;i<list1.size();i++) {
			nums1[i] = list1.get(i);
		}

		for (int i=0;i<list1.size();i++){

			System.out.println(nums1[i]);
		}

	}
}
