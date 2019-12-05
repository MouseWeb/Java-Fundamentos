package funcional_expressoes_lambda.comparator;

import java.util.ArrayList;
import java.util.List;

import map.entities.Product;

public class Comparator {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// Comparator expressão lambda "direto no argumento"
		// https://github.com/acenelio/lambda1-java

		// Comparator é uma interface fucional, uma inteface funcional é aquela que tem apenas um método. 
		// Comparator recebe dois objetos do tipo -> T para serem comparados.
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
