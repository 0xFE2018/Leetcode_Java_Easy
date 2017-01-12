package Easy;

import java.util.ArrayList;
import java.util.List;

public class NumbersDissappearedinArray {

	public static void main(String[] args) {
		NumbersDissappearedinArray obj = new NumbersDissappearedinArray();
		System.out.println(obj.findDisappearedNumbers(new int[] { 4, 3, 2, 7,
				8, 2, 3, 1 }));
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> disappearedInts = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}

		for(int i = 0; i < nums.length; i++){
			if(nums[i]>0){
				disappearedInts.add(i+1);
			}
		}
		
		return disappearedInts;
	}
}
