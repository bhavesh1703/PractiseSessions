package phase1;

import java.util.ArrayList;
import java.util.List;

public class EvenFilter {
	
	 //28-12-25: Day 4 - Create seperate method for getting even number from array
	
	public static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> list) {
		ArrayList<Integer> evens = new ArrayList<>();
		
		for(Integer i : list) {
			if(i % 2 == 0) {
				evens.add(i);
			}
			
		}
		return evens;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(List.of(10, 15, 22, 40, 9, 17, 88, 4));
		
		System.out.println("Original List: " +nums);
		System.out.println("Even List: "+getEvenNumbers(nums));

	}


}
