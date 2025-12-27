package phase1;

public class MinMax {
	
	//25-12-25 : Day 1 - Find the Min-Max from the given Array
	public static void main(String[] args) {
		
		int[] nums = {45, 62, 82, 26, 48, 40, 12, 87, 98, 34, 51};
		
		int min = nums[0];
		int max = nums[0];
		
		
		
		for(int i = 1; i < nums.length; i++) {
//			System.out.println("A "+nums[i]);
			if(nums[i] < min) {
				min = nums[i];
//				System.out.println("B "+min);
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.println("Min value is : " + min);
		System.out.println("Max value is : " + max);
		
	}

}
