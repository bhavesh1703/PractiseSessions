package phase1;

public class ArrayUtils {
	
	 //28-12-25: Day 4 - Utility Style
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
//				return max;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
//				return max;
			}
		}
		return min;
	}
	
	public static int getSum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 45, 7, 99, 6, 30};
		
		System.out.println("Sum of Values: " +getSum(arr));
		System.out.println("Max Value: "+getMax(arr));
		System.out.println("Min Value: "+getMin(arr));


	}

}
