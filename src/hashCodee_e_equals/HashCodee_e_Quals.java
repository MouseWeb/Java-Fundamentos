package hashCodee_e_equals;

import hashCodee_e_equals.entities.Cliente;

public class HashCodee_e_Quals {
	
	//	hashCodee equals
	//		� S�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro.
	//		� equals: lento, resposta 100% 
	//		� hashCode: r�pido, por�m resposta positiva n�o � 100%
	//		� Tipos comuns (String, Date, Integer, Double, etc.) j� possuem implementa��o para essas opera��es. 
	//			Classes personalizadas precisamsobrep�-las.
	
	//	Regra de ouro do HashCode
	//		� Se o hashCodede dois objetos for diferente, ent�o os dois objetos s�o diferentes
	//		� Se o c�digo de dois objetos for igual, muito provavelmente os objetos s�o iguais (pode haver colis�o)

	public static void main(String[] args) {

	//	Equals:	M�todo que compara se o objeto � igual a outro, retornando true ou false.
		String a = "Maria"; 
		String b = "Alex";
		System.out.println(a.equals(b));
		
	//	HashCode: M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto.
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
		
		// Tratamento especial para literais, que n�o s�o instacia uma classe para ser um objeto. 
		System.out.println(s1 == s2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// o ( == ) = compara n�o o conte�do e sim o endere�o de memoria na Heap, ent�o a referencia de memoria dele � false.
		// ( == ) = compara o endere�o de referencia a do objeto.
		System.out.println(c1 == c3);
		
	}

}
