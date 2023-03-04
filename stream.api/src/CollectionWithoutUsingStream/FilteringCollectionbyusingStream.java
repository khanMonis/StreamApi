package CollectionWithoutUsingStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {

	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class FilteringCollectionbyusingStream {

	public static void main(String[] args) {

		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1, "Dell", 10000f));
		list.add(new Product1(2, "HP", 20000f));
		list.add(new Product1(3, "Lenovo", 30000f));
		list.add(new Product1(4, "Toshiba", 40000f));
		list.add(new Product1(5, "Sony", 50000f));

		List<Float> collect = list.stream().filter(p -> p.price > 15000).map(p -> p.price).collect(Collectors.toList());

		System.out.println(collect);
	}
}
