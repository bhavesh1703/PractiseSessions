package phase1;

public class SumArray {
	
	public static void main(String[] args) {
		
		int[] nums = {56, 34, 65, 75, 89, 93, 21, 43};
		int sum = 0;
		
//		for(int i = 0; i < nums.length; ++i) {
//			
//			sum += nums[i];
//		}
		
		for(int i : nums) {
			sum += i;
		}
		
		System.out.println("Sum of given array is : " + sum);
	}

}
