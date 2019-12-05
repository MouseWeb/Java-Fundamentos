package funcional_expressoes_lambda.interface_funcional.Pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import funcional_expressoes_lambda.interface_funcional.consumer.Product;

public class Pipeline {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;

		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
		
		
		System.out.println("--------------------------------------------------------------------");
		
		
		List<Integer> list1 = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list1.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list1.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list1.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
