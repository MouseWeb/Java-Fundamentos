package set_HashSet_TreeSet_LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

import set_HashSet_TreeSet_LinkedHashSet.entities.Product;

public class TreeSet_Compara_Elementos {
	
	//	Recordando as implementa��es
	//		� Principais implementa��es: 
	//			� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
	//			� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo compareTodo objeto (ou Comparator)
	//			� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados

	public static void main(String[] args) {
		
		// Quando ultilizamos o (TreeSet) a Classe do conjunto tem que ser uma implementa��o do Comparable,
		// para que seja posivel a ordena��o de seu objetos.
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
