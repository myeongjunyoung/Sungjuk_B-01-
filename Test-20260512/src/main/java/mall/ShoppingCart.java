package mall;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Product> item;
	public ShoppingCart() {
		item = new ArrayList<Product>();
		item.add(new Product("p001","iPhone13",100));
		item.add(new Product("p002","Galaxy22",150));
		item.add(new Product("p003","Xiaomi",50));
	}
	public List <Product> getItem(){
		return item;
	}
}
