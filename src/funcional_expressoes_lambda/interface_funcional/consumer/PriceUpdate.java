package funcional_expressoes_lambda.interface_funcional.consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);

	}
}