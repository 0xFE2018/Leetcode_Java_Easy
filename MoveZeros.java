package Easy;

public class MoveZeros {

	public void moveZeroes(int[] nums) {
		
		int j = 0;

		for (int k = 0; k < nums.length;k++) {
			if (nums[k] != 0) {
				nums[j]=nums[k];
				j++;
			} 
		}
		
		for(int i=j;i<nums.length;i++){
			nums[i]=0;
		}

	}

}
