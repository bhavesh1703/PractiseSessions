package phase1;

public class Students {
	
	//27-12-25: Day 3 - Encapsulation with getters and setters
	
	String name;
	int rollNo;
	int marks;
	
	public void setName(String stName) {
		this.name = stName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int stRoll) {
		this.rollNo = stRoll;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setMarks(int stMarks) {
		this.marks = stMarks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void printDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Roll No.: " + getRollNo());
		System.out.println("Marks: " + getMarks());
	}
	
	public static void main(String[] args) {
		Students st = new Students();
		st.setName("Rohit");
		st.setRollNo(45);
		st.setMarks(264);
		
		st.printDetails();
	}
	
	
	


}
