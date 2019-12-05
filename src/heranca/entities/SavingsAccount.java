package heranca.entities;

public final class SavingsAccount extends Account {
	
	// Classes e m�todos final
	//		� Palavra chave: final
	//		� Classe: evita que a classe seja herdada
	//			public final class SavingsAccount {
	//		� M�todo: evita que o m�todo sob seja sobreposto
	//		� Exemplo -Classe final
	//			- Suponha que voc� queira evitar que sejam criadas subclasses de SavingsAccount
	//				public final class SavingsAccount { (...)
	
	// Exemplo -m�todo final:
	//		� Suponha que voc� n�o queira que o m�todo Withdrawde SavingsAccountseja sobreposto
	//			@Override 
	//			public final void withdraw(double amount) {
	//				balance -= amount; }
	
	// Pra qu�? usar a palavra FINAL:
	//		� Seguran�a: dependendo das regras do neg�cio, �s vezes � desej�vel garantir que uma classe n�o seja herdada, 
	//					ou que um m�todo n�o seja sobreposto.
	//			� Geralmente conv�m acrescentar finalem m�todos sobrepostos, pois sobreposi��es m�ltiplas podem ser uma 
	//					porta de entrada para inconsist�ncias
	//		� Performance: atributos de tipo de uma classe final s�o analisados de forma mais r�pida em tempo de execu��o. 
	//					� Exemplo cl�ssico: String

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
