package excecoes;

public class ExcecoesAplications {
	
	// Exce��es:
	//		� Uma exce��o � qualquer condi��o de erro ou comportamento inesperado encontrado por um programa em execu��o
	//		� Em Java, uma exce��o � um objeto herdado da classe: 
	//			� java.lang.Exception = o compilador obriga a tratar ou propagar 
	//			� java.lang.RuntimeException = o compilador n�o obriga a tratar ou propagar
	//		� Quando lan�ada, uma exce��o � propagada na pilha de chamadas de m�todos em execu��o, 
	//			at� que seja capturada (tratada) ou o programa seja encerrado
	
	// Hierarquia de exce��es do Java:
	//	Throwable = Classe generica de todas exce��es.
	//	|---> Error = Erros n�o esperado que o Dev n�o ir� tratar por n�o ser do programa:
	//	|	   |--> OutOfMemoryError = Erro de estouro de m�moria ram.
	//	|	   |--> VirtualMachineError = Deu um erro na m�quina virtual do Java, o programa n�o trata esse tipo de erro inesperado.
	//  |
	//	|---> Exception = O Dev ir� tratar por que s�o os erros que acontece no programa, que se esper� que o programa ir� tratar:
	//		   |--> IOException = Erro de entrada e saida vai dispar� essa exce��o.
	//		   |
	//		   |--> RuntimeException = Exce��es que o compilador n�o obriga a tratar:
	//                    |
	//					  |--> IndexOutOfBoundsException = Erro quando tentamos acessar uma posi��o do Array que n�o existe.
	//					  |--> NullPointerException = Erro quando tenta acessar uma vari�vel que esta valendo NULL.
	
	// Por que exce��es?
	//		� O modelo de tratamento de exce��es permite que erros sejam tratados de forma consistente e flex�vel, usando boas pr�ticas
	//		� Vantagens:
	//			� Delega a l�gica do erro para a classe respons�vel por conhecer as regras que podem ocasionar o erro
	//			� Trata de forma organizada (inclusive hier�rquica) exce��es de tipos diferentes
	//			� A exce��o pode carregar dados quaisquer

	public static void main(String[] args) {


	}

}
