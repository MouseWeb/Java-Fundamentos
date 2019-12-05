package heranca.entities;

public final class SavingsAccount extends Account {
	
	// Classes e métodos final
	//		• Palavra chave: final
	//		• Classe: evita que a classe seja herdada
	//			public final class SavingsAccount {
	//		• Método: evita que o método sob seja sobreposto
	//		• Exemplo -Classe final
	//			- Suponha que você queira evitar que sejam criadas subclasses de SavingsAccount
	//				public final class SavingsAccount { (...)
	
	// Exemplo -método final:
	//		• Suponha que você não queira que o método Withdrawde SavingsAccountseja sobreposto
	//			@Override 
	//			public final void withdraw(double amount) {
	//				balance -= amount; }
	
	// Pra quê? usar a palavra FINAL:
	//		• Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, 
	//					ou que um método não seja sobreposto.
	//			• Geralmente convém acrescentar finalem métodos sobrepostos, pois sobreposições múltiplas podem ser uma 
	//					porta de entrada para inconsistências
	//		• Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução. 
	//					• Exemplo clássico: String

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
