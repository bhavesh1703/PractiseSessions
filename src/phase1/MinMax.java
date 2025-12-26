package phase1;

public class MinMax {
	
	public static void main(String[] args) {
		
		int[] nums = {45, 62, 82, 26, 48, 40, 12, 87, 98, 34, 51};
		
		int min = nums[0];
		int max = nums[0];
		
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.println("Min value is : " + min);
		System.out.println("Max value is : " + max);
		
	}

}
