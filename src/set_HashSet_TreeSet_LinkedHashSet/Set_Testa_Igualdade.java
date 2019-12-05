package set_HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Set;

import set_HashSet_TreeSet_LinkedHashSet.entities.Product;

public class Set_Testa_Igualdade {
	
	//	Como as cole��es Hashtestam igualdade?
	//		� Se hashCodee equalsestiverem implementados: 
	//			� Primeiro hashCode. Se der igual, usa equalspara confirmar.
	//			� Lembre-se: String, Integer, Double, etc. j� possuem equalse hashCode
	//		� Se hashCodee equalsN�Oestiverem implementados: 
	//			� Compara as refer�ncias (ponteiros) dos objetos.

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		// Verifica se o mesmo dado esta inserido na lista, compara��o por ponteiro-refer�ncia se n�o tiver HashCod e quals da false.
		// Se tiver d� true, ai n�o compara as refer�ncia de duas instancia e sim o valor dos objetos.
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
