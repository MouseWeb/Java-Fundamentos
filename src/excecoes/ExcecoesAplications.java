package excecoes;

public class ExcecoesAplications {
	
	// Exceções:
	//		• Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução
	//		• Em Java, uma exceção é um objeto herdado da classe: 
	//			• java.lang.Exception = o compilador obriga a tratar ou propagar 
	//			• java.lang.RuntimeException = o compilador não obriga a tratar ou propagar
	//		• Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, 
	//			até que seja capturada (tratada) ou o programa seja encerrado
	
	// Hierarquia de exceções do Java:
	//	Throwable = Classe generica de todas exceções.
	//	|---> Error = Erros não esperado que o Dev não irá tratar por não ser do programa:
	//	|	   |--> OutOfMemoryError = Erro de estouro de mémoria ram.
	//	|	   |--> VirtualMachineError = Deu um erro na máquina virtual do Java, o programa não trata esse tipo de erro inesperado.
	//  |
	//	|---> Exception = O Dev irá tratar por que são os erros que acontece no programa, que se esperá que o programa irá tratar:
	//		   |--> IOException = Erro de entrada e saida vai dispará essa exceção.
	//		   |
	//		   |--> RuntimeException = Exceções que o compilador não obriga a tratar:
	//                    |
	//					  |--> IndexOutOfBoundsException = Erro quando tentamos acessar uma posição do Array que não existe.
	//					  |--> NullPointerException = Erro quando tenta acessar uma variável que esta valendo NULL.
	
	// Por que exceções?
	//		• O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
	//		• Vantagens:
	//			• Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro
	//			• Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
	//			• A exceção pode carregar dados quaisquer

	public static void main(String[] args) {


	}

}
