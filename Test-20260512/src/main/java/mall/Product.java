package mall;

public class Product {

	private String pid;
	private String pName;
	private int price;
	
	public Product(String pid,String pName, int price) {
		this.pid = pid;
		this.pName = pName;
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
