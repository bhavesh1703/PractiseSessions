package phase1;

public class CarTest {
	
	private String brand;
	private String model;
	private double price;
	
	public CarTest(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void applyDiscount(double percent) {
		if(percent > 50 ) {
			System.out.println("Discount can't be greater than 50");
		}
		price = price -(percent * price / 100);
		System.out.println("Newly discounted price is " + price);
	}
	
	public void printInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}
	
	public static void main(String[] args) {
		CarTest car1 = new CarTest("TATA", "Harrier", 2200000);
		CarTest car2 = new CarTest("BMW", "M3", 14000000);
		
		car1.applyDiscount(25);
		car1.printInfo();
		
		car2.applyDiscount(50);
		car2.printInfo();
	}

}
