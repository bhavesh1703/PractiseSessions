package phase1;

import java.util.Scanner;

public class EvenOdd {
	
	//25-12-25 : Day 1 - Check number is even or not
	public static void isEven(int num) {
		if(num % 2 == 0) {
			System.out.println("Number " + num + " is even.");
		}
		else {
			System.out.println("Number " + num + " is odd.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i = sc.nextInt();
		isEven(i);
		sc.close();
	}
}
