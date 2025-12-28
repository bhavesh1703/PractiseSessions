package phase1;

public class StringTasks {
	
	//28-12-25: Day 4 - i. Count vowerls in given string
	//					ii. Reverse the words in the string
	
	public static int countVowels(String input) {
		int count = 0;
		
		
		String str = input.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static String reverseWords(String input) {
		String[] words = input.split(" +");
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		System.out.println("The count of vowels is : " +countVowels("Hello Automation Testing"));
		
		System.out.println(reverseWords("Hello World"));
		
		System.out.println(reverseWords("Successfully Reversed"));

	}

}
