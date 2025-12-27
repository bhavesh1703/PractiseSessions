package phase1;

public class ReverseArray {
	
	//26-12-25: Day 3- Reverse the given array
	
	static void reverse(int[] ar) {
		int i = 0;
		int j = ar.length - 1;
		
		while( i < j) {
			int t = ar[i];
			ar[i] = ar[j];
			ar[j] = t;
			
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		reverse(arr);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
