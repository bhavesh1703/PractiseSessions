package minicart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private HashMap<Product, Integer> cartItems;
	
	public Cart() {
		this.cartItems = new HashMap<>();
	}
	
	public void addProduct(Product product, int quantity) {
		if(cartItems.containsKey(product)) {
			int existingQty = cartItems.get(product);
			cartItems.put(product, existingQty + quantity);
		} else {
			cartItems.put(product, quantity);
		}
		
	}
	
	public double getTotalAmount() {
		double total = 0.0;
		
		for(Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
			Product product = entry.getKey();
			int qty = entry.getValue();
			total += product.getPrice() * qty;
		}
		
		return total;
	}
	
}
