package contaBancaria;

public class ClassePrincipal {
	
	//EM JAVA TEMOS 4 MODIFICADORES DE ACESSO:
	// - PUBLIC - TODOS (CLASSES) TERÃO ACESSO.
	// - PRIVATE - APENAS PODE SER ACESSADO DE DENTRO DA CLASSE.
	// - PROTECTED - PODE SER ACESSADO, ESTANDO DENTRO DO MESMO PACOTE E/ OU CLASSES.
	// - DEFAUT - CASO NÃO TENHA SIDO DEFINIDO NENHUM MODIFICADOR, ESSE SERÁ UTILIZADO, PERMITINDO O ACESSO DENTRO DO PACOTE.
	
	// -----------------------------------------------------------------------------------------------------------------------------
	
	// private: o membro só pode ser acessado na própria classe
	// (nada): o membro só pode ser acessado nas classes do mesmo pacote
	// protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
	// public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente  que não exporte o pacote onde ele está)

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(100);//200
		conta.sacar(50);//150
		
		conta.minhaPropriedadeProtegida = "DOUGLAS COELHO";
		
		System.out.println( conta.retornarSaldo() );
		
		System.out.println( conta.minhaPropriedadeProtegida );
	}

}