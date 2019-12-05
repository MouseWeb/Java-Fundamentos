package set_HashSet_TreeSet_LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_TreeSet_LinkedHashSet {
	
	//	Set<T>
	//		� Representa um conjunto de elementos (similar ao da �lgebra) 
	//		� N�o admite repeti��es 
	//		� Elementos n�o possuem posi��o 
	//		� Acesso, inser��o e remo��o de elementos s�o r�pidos 
	//		� Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a. 
	//		� Principais implementa��es: 
	//			� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado 
	//			� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo compareTodo objeto (ou Comparator) 
	//			� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados

	//	Alguns m�todos importantes
	//		� add(obj), remove(obj), contains(obj) 
	//			� Baseado em equalse hashCode 
	//			� Se equalse hashCoden�o existir, � usada compara��o de ponteiros 
	//		� clear() 
	//		� size() 
	//		� removeIf(predicate)
	//		� addAll(other) - uni�o: adiciona no conjunto os elementos do outro conjunto, sem repeti��o 
	//		� retainAll(other) - interse��o: remove do conjunto os elementos n�o contitosem other 
	//		� removeAll(other) - diferen�a: remove do conjunto os elementos contidos em other

	public static void main(String[] args) {
		
		// HashSet = � o mais r�pido mais ele n�o ordenar os dados
		// TreeSet = ordena po ordem alfabetica
		// LinkedHashSet = mantem a ordem que os objetos foram inseridos.
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		// Remove o objeto da lista
		set.remove("TV");
		
		// Remove apenas os objetos que satisfa�a o predicado determinado, remove as palavras que tem mais de 3 caracteres.
		set.removeIf(x -> x.length() >= 3);
		// Remove todo mundo que tenha a letra T na posi��o -> 0.
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
		
		// difference = remove todo mundo do conjunto (e) que est� no conjunto (b), pega a diferen�a que n�o existe no outro conjunto.
		Set<Integer> e = new TreeSet<>(a); 
		e.removeAll(b);
		System.out.println(e);

	}

}
