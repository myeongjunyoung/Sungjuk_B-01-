package mall;

import java.util.ArrayList;
import java.util.List;
public class Order {
	public int processOrder() {
		ShoppingCart sc = new ShoppingCart();
		List<Product>item = sc.getItem();
		
		int count = item.size();
		int total =0;
		for(int i = 0;i< count; i++) {
			Product p = item.get(i);
			int price = p.getPrice();
			total= total+price;
		}
		return total;
	}
}
