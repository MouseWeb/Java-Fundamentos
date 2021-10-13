package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import map.entities.Product;

public class MapProgram {
	
	//	Map<K,V>: é uma estrutura de dados genérica só que ele tem dois tipos ele tem um tipo chave (K) e um tipo valor (V).
	//		• É uma coleção de pares chave / valor 
	//			• Não admite repetições do objeto chave 
	//			• Os elementos são indexados pelo objeto chave (não possuem posição) 
	//			• Acesso, inserção e remoção de elementos são rápidos 
	//		• Uso comum: cookies, local storage, qualquer modelo chave-valor
	//		• Principais implementações: 
	//			• HashMap-mais rápido (operações O(1) em tabela hash) e não ordenado 
	//			• TreeMap-mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTodo objeto (ou Comparator) 
	//			• LinkedHashMap-velocidade intermediária e elementos na ordem em que são adicionados
	
	//	Alguns métodos importantes
	//		• put(key, value), remove(key), containsKey(key), get(key) 
	//			• Baseado em equalse hashCode 
	//			• Se equalse hashCodenão existir, é usada comparação de ponteiros
	//		• clear() 
	//		• size()
	//		• keySet() - retorna um Set<K> 
	//		• values() - retorna um Collection<V>

	public static void main(String[] args) {
	
		Map<String, String> cookies = new TreeMap<>();
		
		// put -> inserir um elemento em nosso MAP -> passando a chave e valor.
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
			
		System.out.println("---------------------------------------------------------------------------------");
			
			Map<Product, Double> stock = new HashMap<>();
			
			Product p1 = new Product("Tv", 900.0);
			Product p2 = new Product("Notebook", 1200.0);
			Product p3 = new Product("Tablet", 400.0);
			
			stock.put(p1, 10000.0);
			stock.put(p2, 20000.0);
			stock.put(p3, 15000.0);
			
			Product ps = new Product("Tv", 900.0);
			System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

		}
	
	}

}
