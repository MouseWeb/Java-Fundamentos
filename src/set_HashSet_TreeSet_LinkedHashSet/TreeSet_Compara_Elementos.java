package set_HashSet_TreeSet_LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

import set_HashSet_TreeSet_LinkedHashSet.entities.Product;

public class TreeSet_Compara_Elementos {
	
	//	Recordando as implementações
	//		• Principais implementações: 
	//			• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
	//			• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTodo objeto (ou Comparator)
	//			• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados

	public static void main(String[] args) {
		
		// Quando ultilizamos o (TreeSet) a Classe do conjunto tem que ser uma implementação do Comparable,
		// para que seja posivel a ordenação de seu objetos.
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
