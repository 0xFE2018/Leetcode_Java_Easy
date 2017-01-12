package Easy;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			if (set1.contains(num))
				set2.add(num);
		}
		
		int[] result= new int[set2.size()];
		int i=0;
		for(int num:set2){
			result[i]=num;
			i++;
		}
		
		return result;

	}

}
