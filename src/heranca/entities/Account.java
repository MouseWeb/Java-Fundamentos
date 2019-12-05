package heranca.entities;

public abstract class Account {
	
	// Palavra super:
	//		É possível chamar a implementação da superclasse usando a palavra super.
	// 		Exemplo: 
	//			suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0.
	//		@Override 
	//		public void withdraw(double amount) { 
	//			super.withdraw(amount); 
	//			balance -= 2.0; 
	//		}
	
	// Classes abstratas
	//		• São classes que não podem ser instanciadas
	//		• É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
