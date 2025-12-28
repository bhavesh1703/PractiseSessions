package phase1;

public class ContainsCheck {
	
	//27-12-25: Day 3: Check the array contains targeted value without using built in method
	
	public static boolean containsValue(int[] arr, int target) {
		for(int a : arr) {
			if(a == target) {
				return true;
			}	
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {45, 18, 99, 17, 93};
		
		System.out.println(containsValue(arr, 15) ? "Found" : "Not Found");
		System.out.println(containsValue(arr, 93) ? "Found" : "Not Found");
	}

}
