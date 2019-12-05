package construtores;

public class ConstrutorPrincipal {
	
	// CONTRUTORES:
	// RESPONSÁVEL PELA INICIALIZAÇÃO DO NOSSO OBJETO.
	// CONSTRUTOR DEVE SEMPRE TER O MESMO NOME DA CLASSE.
	// NÃO PERMITE RETORNO DE VALOR. 
	// NÃO É OBRIGATÓRIO.

	public static void main(String[] args) {

		Conta conta = new Conta( 10200 );// QUANDO INSTÂNCIA UMA CLASSE O (CONSTRUTOR) É CHAMADO.
		
		conta.imprime();

	}

}
