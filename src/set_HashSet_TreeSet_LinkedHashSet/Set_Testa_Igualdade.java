package set_HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Set;

import set_HashSet_TreeSet_LinkedHashSet.entities.Product;

public class Set_Testa_Igualdade {
	
	//	Como as coleções Hashtestam igualdade?
	//		• Se hashCodee equalsestiverem implementados: 
	//			• Primeiro hashCode. Se der igual, usa equalspara confirmar.
	//			• Lembre-se: String, Integer, Double, etc. já possuem equalse hashCode
	//		• Se hashCodee equalsNÃOestiverem implementados: 
	//			• Compara as referências (ponteiros) dos objetos.

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		// Verifica se o mesmo dado esta inserido na lista, comparação por ponteiro-referência se não tiver HashCod e quals da false.
		// Se tiver dá true, ai não compara as referência de duas instancia e sim o valor dos objetos.
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
