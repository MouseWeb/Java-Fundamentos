package for_each;

// Laço "for each": Sintaxe opcional e simplificada para percorrer coleções

//	Sintaxe:
//		for (Tipo apelido : coleção) { 
//           	<comando 1> 
//				<comando 2> 
// 	}

public class ForEach {

	public static void main(String[] args) {

		// Leitura: "para cada objeto 'obj' contido em vect, faça:"
		String[] vect = new String[] { "Douglas", "Leticia", "Bob" };
		
		// Laço "for each"
		// a forma em que ler esse for each -> para cada objeto -> | obj |, contido -> | : |, no vetor -> | vect |, fassa ...
		for (String obj : vect) { // String -> Tipo, obj -> Apelido, vect -> Coleção.
			// esse for pecorre todos os elementos do meu vetor | vect | chamando cada em dos elementos de -> obj.
			System.out.println(obj); 
		}
		
		// For comum
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

	}

}
