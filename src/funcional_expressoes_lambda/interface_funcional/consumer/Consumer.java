package funcional_expressoes_lambda.interface_funcional.consumer;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
	
	//	Consumer
	//		https://docs.oracle.com/javase/10/docs/api/java/util/function/Consumer.html

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;

		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
	}

}
