package phase1;

public class AssertUtils {
	
	//28-12-25: Day 4 - Create the Assert Methods to compare result
	
	public static void assertEquals(int expected, int actual) {
		if(expected == actual) {
			System.out.println("Pass: " +expected + " = " + actual);
		}
		else {
			System.out.println("Fail: " +expected + " <> " + actual);
		}
	}
	
	public static void assertEquals(String expected, String actual) {
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("Pass: " +expected + " = " + actual);
		}
		else {
			System.out.println("Fail: " +expected + " <> " + actual);
		}
	}
	
	public static void assertTrue(boolean condition) {
		System.out.println( condition ? "Pass" : "Fail");
	}
	
	public static void assertFalse(boolean condition) {
		System.out.println( condition ? "Pass" : "Fail");
	}
	
	public static void main(String[] args) {
		//AssertEquals - int
		assertEquals(10, 10);	//Pass
		assertEquals(30, 10);	//Fail
		
		//AssertEquals - String
		assertEquals("Expected", "Expected");	//Pass
		assertEquals("Expected", "Actual");		//Fai;
		
		assertTrue(45 < 95); 		//Pass
		assertTrue(55 < 15);		//Fail
		
		assertFalse(50 > 20);		//Pass
		assertFalse(99 < 98);		//Fail
		
		int[] arr = {34, 45, 63, 75, 83, 53, 81, 4, 92};
		
		assertTrue(ContainsCheck.containsValue(arr, 75));	//Pass
		assertTrue(ContainsCheck.containsValue(arr, 77));	//Fail
		
		
	}

}
