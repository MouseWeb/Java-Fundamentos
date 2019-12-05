package enumeracoes;

import java.util.Date;
import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

public class Enum {
	
	// Enumerações:
	//		• É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
	//		• Palavra chave em Java: enum
	//		• Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
	
	// Conversão de Stringpara enum:
	//		OrderStatus os1 = OrderStatus.DELIVERED;
	//		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

	public static void main(String[] args) {
		
		Order order = new Order(100, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSANDO;
		OrderStatus os2 = OrderStatus.valueOf("PROCESSANDO");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
