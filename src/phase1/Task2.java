package phase1;

import java.util.Scanner;

public class Task2 {
	
	//Find Factorial of number
	
	public static int getFactorial(int num) {
		int f = 1;
		
		for(int i = 1; i <= num; ++i) {
			f *= i;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int a = sc.nextInt();
		System.out.println("The Factorial of " +a + " is "+ getFactorial(a));
		
		
	}

}
