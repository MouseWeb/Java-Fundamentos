package array_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	// Listas:
	// � Lista � uma estrutura de dados:
	// � Homog�nea (dados do mesmo tipo)
	// � Ordenada (elementos acessados por meio de posi��es)
	// � Inicia vazia, e seus elementos s�o alocados sob demanda
	// � Cada elemento ocupa um "n�" (ou nodo) da lista
	// � Tipo (interface): List
	// � Classes que implementam: ArrayList, LinkedList, etc.
	// � Vantagens:
	// � Tamanho vari�vel
	// � Facilidade para se realizar inser��es e dele��es
	// � Desvantagens:
	// � Acesso sequencial aos elementos *

	// � Tamanho da lista: size()
	// � Obter o elemento de uma posi��o: get(position)
	// � Inserir elemento na lista: add(obj), add(int, obj)
	// � Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
	// � Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj)
	// � Filtrar lista com base em predicado: List<Integer> result =
	// list.stream().filter(x -> x > 4).collect(Collectors.toList());
	// � Encontrar primeira ocorr�ncia com base em predicado: Integer result =
	// list.stream().filter(x -> x > 4).findFirst().orElse(null);

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Douglas");
		list.add("Leticia");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		// tamanho da lista
		System.out.println(list.size());
		
		// Remove da lista
		//list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// Remove elemento por predicado, primeira letra 'M'
		// como fala a condi��o -> quero remover todo string -> | x |, tal que -> | -> |, o -> | x.charAt(0) |, seja igual -> | == | a 'M'.
		//         | |          -> pega um valor | x | que � do tipo String e me retorna se esse | x.charAt(0) | � igual a 'M',
		//                                                                                        	Essa resposta vai retorna verdadeiro vou falso.
		list.removeIf(x -> x.charAt(0) == 'M'); // Fun��o Lambda -> (x -> x.charAt(0) == 'M') que chama - se predicado por que vai retornar V ou F.
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// Encontrar a posi��o de um elemento na lista -> indexOf
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Quando o | indexOf | n�o encontra o elemento ele retorna -1 como resposta.
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");
		
		// Filtra a lista por todo mundo que comece com a letra 'A'
		// stream -> � um tipo especial do Java 8 endiante que aceita espress�es Lambdas, o stream � do tipo String,
		//           o stream n�o � compativel com List por que � String, temos que converte para lista.
		// Collectors.toList() -> converte o stream para List.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// Encontra um elemento da lista que atenda um certo predicado e caso n�o encontrar retorna NULL.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
