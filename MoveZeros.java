package Easy;

public class MoveZeros {

	public static void main(String[] args) {
		MoveZeros obj = new MoveZeros();
		int[] nums = new int[] {1};
		obj.moveZeroes(nums);
		for (int num : nums) {
			System.out.println(num);
		}
	}

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
