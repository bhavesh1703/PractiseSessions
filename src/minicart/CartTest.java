package minicart;

import phase1.AssertUtils;

public class CartTest {

	public static void main(String[] args) {
		
		Product laptop = new Product(101, "Laptop", 60000);
		Product mobile = new Product(102, "Mobile", 40999);
		Product headphones = new Product(103, "HEadPhones", 12000);
		
		Cart cart = new Cart();
		cart.addProduct(headphones, 5);
		cart.addProduct(mobile, 5);
		cart.addProduct(laptop, 3);
		
		double total = cart.getTotalAmount();
		System.out.println("Total of the cart is :" + total);
		
		AssertUtils.assertTrue(total < 450000.0);
	}
}
