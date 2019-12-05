// pacote da classe
package orientacaoObjeto.entities;

  /* Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. 
     A lógica do cálculo da área não deve estar em outro lugar. -> COESÃO
   */

// nome da classe
public class TrianguloEntities {
	
	// double -> tipo da variavel que tem atributos da classe | a, b e c.
	// public -> o prefixo indica que o atributo ou método pode ser usado em outros arquivos.
	public double a;
	public double b;
	public double c;
	
	// double -> Tipo do dado que o método retorna (se o método nãoretorna nada, usa a palavra "void").
	// area() -> nome do método.
	// () -> Lista de parâmetros do método.
	public double area() {
		// corpo do método
		double p = (a + b + c) / 2.0; // corpo do método
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
