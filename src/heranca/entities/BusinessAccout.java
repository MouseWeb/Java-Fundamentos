package heranca.entities;

public class BusinessAccout extends Account {

	private Double loanLimit;

	public BusinessAccout() {
		super(); // caso no futuro seja implementado uma lógica no construtor padrão da classe Account a classe BusinessAccount herda.
	}

	public BusinessAccout(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // chama o construtor da super classe que é a classe Account, passando os
										// argumentos.
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}

	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
