package Easy;

public class SingleNumber {

	public static void main(String[] args) {
      SingleNumber obj=new SingleNumber();
      System.out.println(obj.singleNumber(new int[]{1,0,1}));
	}

	public int singleNumber(int[] nums) {
		
		int result=0;
		
		for(int num:nums){
			result^=num;
		}
		
		return result;
		
	}

}
