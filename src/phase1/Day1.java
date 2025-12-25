package phase1;

public class Day1 {
	
	//TypeCasting -----------------------------------------------------------
	static class Animal {
		
		public void makeSound(){
			System.out.println("Animal makes sound.");
		}
	}
	
	static class Dog extends Animal {
		
		public void makeSound() {
			System.out.println("The dog barks");
		}
		
		public void cook() {
			System.out.println("Dog cooks the food");
		}
	}
	
	static class Cat extends Animal {
		
		public void meow() {
			System.out.println("The Cat meows...");
		}
	}
	
	public static class Runner {
		public static void main(String[] args) {
		
		//Upcasting
		Animal animal = new Dog();
		animal.makeSound();
		
		//DownCasting
		Animal a = new Cat();
		a.makeSound();
		
		Cat cat = (Cat)a;	//downcasting
		cat.meow();

		
	}
}

}
