package phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
	
	//26-12-25: Day 3- Find the sum of numbers using ArrayList
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 7;
		int sum = 0;
		System.out.println("Enter " + count + " numbers");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			arr.add(sc.nextInt());
		}
		
		for(int num : arr) {
			sum += num;
		}
		
		System.out.println("Total sum is : " + sum);
		sc.close();
		
	}
	

}
