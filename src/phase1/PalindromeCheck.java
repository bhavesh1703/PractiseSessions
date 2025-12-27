package phase1;

import java.util.Scanner;

public class PalindromeCheck {
	
	//27-12-25: Day 3- Check that String is Palindrome or not
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String org_str = str;
		String rev = "";
		
		for(int i = str.length()-1; i >=0;i--) {
			rev += str.charAt(i);
		}
		
		if(org_str.equalsIgnoreCase(rev)) {
			System.out.println("String '" + str + "' is palindrome");
		} 
		else {
			System.out.println("String '" + str + "' is not palindrome");
		}
		sc.close();
		
	}
	

}
