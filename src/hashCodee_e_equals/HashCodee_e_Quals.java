package hashCodee_e_equals;

import hashCodee_e_equals.entities.Cliente;

public class HashCodee_e_Quals {
	
	//	hashCodee equals
	//		• São operações da classe Object utilizadas para comparar se um objeto é igual a outro.
	//		• equals: lento, resposta 100% 
	//		• hashCode: rápido, porém resposta positiva não é 100%
	//		• Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. 
	//			Classes personalizadas precisamsobrepô-las.
	
	//	Regra de ouro do HashCode
	//		• Se o hashCodede dois objetos for diferente, então os dois objetos são diferentes
	//		• Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)

	public static void main(String[] args) {

	//	Equals:	Método que compara se o objeto é igual a outro, retornando true ou false.
		String a = "Maria"; 
		String b = "Alex";
		System.out.println(a.equals(b));
		
	//	HashCode: Método que retorna um número inteiro representando um código gerado a partir das informações do objeto.
		String c = "Maria";
		String d = "Alex";
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
	// ----------------------------------------------------------------------------------------------------------------
		
		Cliente c1 = new Cliente("Douglas", "douglas@mouseweb.com.br");
		Cliente c2 = new Cliente("Leticia", "financeiro@mouseweb.com.br");
		Cliente c3 = new Cliente("Douglas", "douglas@mouseweb.com.br");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		// Tratamento especial para literais, que não são instacia uma classe para ser um objeto. 
		System.out.println(s1 == s2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// o ( == ) = compara não o conteúdo e sim o endereço de memoria na Heap, então a referencia de memoria dele é false.
		// ( == ) = compara o endereço de referencia a do objeto.
		System.out.println(c1 == c3);
		
	}

}
