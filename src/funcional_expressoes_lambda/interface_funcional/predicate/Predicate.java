package funcional_expressoes_lambda.interface_funcional.predicate;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);
		
		//	-- Implementa��o da interface
		list.removeIf(new ProductPredicate());
		
		// 	-- Reference method com m�todo est�tico 
		list.removeIf(Product::staticProductPredicate);
		
		//	-- Reference method com m�todo n�o est�tico
		list.removeIf(Product::nonStaticProductPredicate);
		
		//	-- Express�o lambda declarada
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);
		
		//	-- Express�o lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product p : list) {
			System.out.println(p);

		}
	}

}
