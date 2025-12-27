package phase1;

public class SumArray {
	
	//26-12-25: Day 2- Sum of all numbers in Array
	public static void main(String[] args) {
		
		int[] nums = {56, 34, 65, 75, 89, 93, 21, 43};
		int sum = 0;
		
		//Normal for loop
//		for(int i = 0; i < nums.length; ++i) {
//			
//			sum += nums[i];
//		}
		
		//enhanced for loop
		for(int i : nums) {
			sum += i;
		}
		
		System.out.println("Sum of given array is : " + sum);
	}

}
