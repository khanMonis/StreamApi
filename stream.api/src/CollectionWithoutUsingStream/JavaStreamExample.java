package CollectionWithoutUsingStream;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
 
		List<Product> arrayList = new ArrayList<>();
		
		arrayList.add(new Product(1, "HP Laptop", 13000f));
		arrayList.add(new Product(2, "Dell Laptop", 15000f));
		arrayList.add(new Product(3, "LG Laptop", 17000f));
		arrayList.add(new Product(4, "Apple Laptop", 19000f));
		arrayList.add(new Product(5, "Lenovo Laptop", 21000f));
		
		List<Float> arrayList2 = new ArrayList<>();
		
		for(Product product:arrayList) {
		
			if(product.price<19000) {
				arrayList2.add(product.price);
			}
		}
		System.out.println(arrayList2);
	}
}
