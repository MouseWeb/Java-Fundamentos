package construtores;

public class ConstrutorPrincipal {
	
	// CONTRUTORES:
	// RESPONS�VEL PELA INICIALIZA��O DO NOSSO OBJETO.
	// CONSTRUTOR DEVE SEMPRE TER O MESMO NOME DA CLASSE.
	// N�O PERMITE RETORNO DE VALOR. 
	// N�O � OBRIGAT�RIO.

	public static void main(String[] args) {

		Conta conta = new Conta( 10200 );// QUANDO INST�NCIA UMA CLASSE O (CONSTRUTOR) � CHAMADO.
		
		conta.imprime();

	}

}
