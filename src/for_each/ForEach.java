package for_each;

// La�o "for each": Sintaxe opcional e simplificada para percorrer cole��es

//	Sintaxe:
//		for (Tipo apelido : cole��o) { 
//           	<comando 1> 
//				<comando 2> 
// 	}

public class ForEach {

	public static void main(String[] args) {

		// Leitura: "para cada objeto 'obj' contido em vect, fa�a:"
		String[] vect = new String[] { "Douglas", "Leticia", "Bob" };
		
		// La�o "for each"
		// a forma em que ler esse for each -> para cada objeto -> | obj |, contido -> | : |, no vetor -> | vect |, fassa ...
		for (String obj : vect) { // String -> Tipo, obj -> Apelido, vect -> Cole��o.
			// esse for pecorre todos os elementos do meu vetor | vect | chamando cada em dos elementos de -> obj.
			System.out.println(obj); 
		}
		
		// For comum
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

	}

}
