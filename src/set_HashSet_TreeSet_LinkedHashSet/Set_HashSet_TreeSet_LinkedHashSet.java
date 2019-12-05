package set_HashSet_TreeSet_LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_TreeSet_LinkedHashSet {
	
	//	Set<T>
	//		• Representa um conjunto de elementos (similar ao da Álgebra) 
	//		• Não admite repetições 
	//		• Elementos não possuem posição 
	//		• Acesso, inserção e remoção de elementos são rápidos 
	//		• Oferece operações eficientes de conjunto: interseção, união, diferença. 
	//		• Principais implementações: 
	//			• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado 
	//			• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTodo objeto (ou Comparator) 
	//			• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados

	//	Alguns métodos importantes
	//		• add(obj), remove(obj), contains(obj) 
	//			• Baseado em equalse hashCode 
	//			• Se equalse hashCodenão existir, é usada comparação de ponteiros 
	//		• clear() 
	//		• size() 
	//		• removeIf(predicate)
	//		• addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição 
	//		• retainAll(other) - interseção: remove do conjunto os elementos não contitosem other 
	//		• removeAll(other) - diferença: remove do conjunto os elementos contidos em other

	public static void main(String[] args) {
		
		// HashSet = é o mais rápido mais ele não ordenar os dados
		// TreeSet = ordena po ordem alfabetica
		// LinkedHashSet = mantem a ordem que os objetos foram inseridos.
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		// Remove o objeto da lista
		set.remove("TV");
		
		// Remove apenas os objetos que satisfaça o predicado determinado, remove as palavras que tem mais de 3 caracteres.
		set.removeIf(x -> x.length() >= 3);
		// Remove todo mundo que tenha a letra T na posição -> 0.
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		
		// --------------------------------------------------------------------------------------------------------------
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union = junta todos os elementos da lista.
		Set<Integer> c = new TreeSet<>(a); 
		c.addAll(b); 
		System.out.println(c);
		
		// intersection = pega todos elementos em comum nas duas listas.
		Set<Integer> d = new TreeSet<>(a); 
		d.retainAll(b);
		System.out.println(d);
		
		// difference = remove todo mundo do conjunto (e) que está no conjunto (b), pega a diferença que não existe no outro conjunto.
		Set<Integer> e = new TreeSet<>(a); 
		e.removeAll(b);
		System.out.println(e);

	}

}
