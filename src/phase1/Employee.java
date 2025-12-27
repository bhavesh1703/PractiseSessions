package phase1;

public class Employee {
	
	private String name;
	private double salary;
	
	//27-12-25: Day 3: Create Employee class & compare salaries
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
			
	}
	
	public void compareSalary(Employee e) {
		if(this.salary > e.salary) {
			System.out.println(this.name + " salary is greater than " + e.name + ".");
		}
		else if(this.salary < e.salary){
			System.out.println(e.name + " salary is greater than " + this.name + ".");
		}
		else {
			System.out.println(e.name + " and "+ this.name + " have same salary.");
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Vaibhav", 30000);
		Employee e2 = new Employee("Satish", 50000);
		
		e1.compareSalary(e2);
	}

}
