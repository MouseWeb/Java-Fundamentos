// pacote da classe
package orientacaoObjeto.entities;

  /* Delega��o de responsabilidades: quem deve ser respons�vel por saber como calcular a �rea de um tri�ngulo � o pr�prio tri�ngulo. 
     A l�gica do c�lculo da �rea n�o deve estar em outro lugar. -> COES�O
   */

// nome da classe
public class TrianguloEntities {
	
	// double -> tipo da variavel que tem atributos da classe | a, b e c.
	// public -> o prefixo indica que o atributo ou m�todo pode ser usado em outros arquivos.
	public double a;
	public double b;
	public double c;
	
	// double -> Tipo do dado que o m�todo retorna (se o m�todo n�oretorna nada, usa a palavra "void").
	// area() -> nome do m�todo.
	// () -> Lista de par�metros do m�todo.
	public double area() {
		// corpo do m�todo
		double p = (a + b + c) / 2.0; // corpo do m�todo
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
