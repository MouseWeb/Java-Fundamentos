package contaBancaria;

public class ClassePrincipal {
	
	//EM JAVA TEMOS 4 MODIFICADORES DE ACESSO:
	// - PUBLIC - TODOS (CLASSES) TER�O ACESSO.
	// - PRIVATE - APENAS PODE SER ACESSADO DE DENTRO DA CLASSE.
	// - PROTECTED - PODE SER ACESSADO, ESTANDO DENTRO DO MESMO PACOTE E/ OU CLASSES.
	// - DEFAUT - CASO N�O TENHA SIDO DEFINIDO NENHUM MODIFICADOR, ESSE SER� UTILIZADO, PERMITINDO O ACESSO DENTRO DO PACOTE.
	
	// -----------------------------------------------------------------------------------------------------------------------------
	
	// private: o membro s� pode ser acessado na pr�pria classe
	// (nada): o membro s� pode ser acessado nas classes do mesmo pacote
	// protected: o membro s� pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
	// public: o membro � acessado por todas classes (ao menos que ele resida em um m�dulo diferente  que n�o exporte o pacote onde ele est�)

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(100);//200
		conta.sacar(50);//150
		
		conta.minhaPropriedadeProtegida = "DOUGLAS COELHO";
		
		System.out.println( conta.retornarSaldo() );
		
		System.out.println( conta.minhaPropriedadeProtegida );
	}

}