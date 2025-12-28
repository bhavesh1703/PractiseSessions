package phase1;

import java.util.HashMap;

public class StudentMarksMap {
	
	 //28-12-25: Day 4 - Student marks lookup
	
	public static Integer getMarks(HashMap<String, Integer> map, String name) {
		if(map.containsKey(name)) {
			return map.get(name);
		}
		else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		HashMap student= new HashMap();
		student.put("Shree", 95);
		student.put("Rohit", 45);
		student.put("Virat", 18);
		student.put("Rahul", 01);
		student.put("Rishabh", 17);
		
		
		//Check the marks of student
		Integer marks = getMarks(student, "Rohit");
			if(marks != null) {
				System.out.println("Marks of Rohit is : " + marks);
			}
			else {
				System.out.println("Rohit not found");
			}
			
		Integer marks1 = getMarks(student, "Sam");
			if(marks1 != null) {
				System.out.println("Marks of Sam is : " + marks1);
			}
			else {
				System.out.println("Sam not found");
			}
			
		Integer marks2 = getMarks(student, "Rahul");
		if(marks2 != null) {
			System.out.println("Marks of Rahul is : " + marks2);
		}
		else {
			System.out.println("Sam not found");
		}
		
		}
	
	
}
