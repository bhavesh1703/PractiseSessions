package phase1;

import java.util.Scanner;

public class Factorial {
	
	//25-12-25 : Day 1 - Find Factorial of number
	
	public static int getFactorial(int num) {
		int f = 1;
		
		if (num < 0 ) {
			System.out.println("Factorial of negative numbers are not defined");
			return 0;
		}
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
		sc.close();
		
	}

}
