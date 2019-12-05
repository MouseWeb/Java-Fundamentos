package heranca;

import java.util.ArrayList;
import java.util.List;

import heranca.entities.Account;
import heranca.entities.BusinessAccout;
import heranca.entities.SavingsAccount;

public class HerancaPrincipal {

	// Heran�a:
	// 		� � um tipo de associa��o que permite que uma classe herde todosdados e comportamentos de outra
	// 		� Defini��es importantes
	// 	� Vantagens:
	// 		� Reuso
	// 		� Polimorfismo
	// 	� Sintaxe:
	// 		� classA extendsB = a classe A vai herda tudo o que a classe B tem dados e comportamentos.
	// 		- Heran�a permite o reuso de atributos e m�todos (dados e comportamento)

	// 	� Rela��o "�-um"
	// 	� Generaliza��o/especializa��o
	// 	� Superclasse (classe base) / subclasse (classe derivada)
	// 	� Heran�a / extens�o
	// 	� Heran�a � uma associa��o entre classes (e n�o entre objetos): quando intancia uma das classe
	// 		vai ter apenas um objeto por que uma classe extend a outra classe, herda os dados e comportamento.

	// Sobreposi��o ou sobrescrita:
	// 		� � a implementa��o de um m�todo de uma superclasse na subclasse
	// 		� � fortemente recomend�vel usar a anota��o @Overrideem um m�todo sobrescrito
	// 			� Facilita a leitura e compreens�o do c�digo
	// 			� Avisamos ao compilador (boa pr�tica)
	// 			� @Overrideem: � uma anota��o que indentifica que � um m�todo sobre-posto e sobrescrito
	// 	Classe Account:
	// 			public void withdraw(double amount) { 
	//				balance -= amount + 5.0; 
	//			}
	// 	Clasee SavingsAccount:
	// 			@Override -> vai sobrescrever o metodo da classe, 
	//			public void withdraw(double amount) { 
	//				balance -= amount; // Implementado diferente da superclasse, n�o desconta o valor 5.0.
	//		}
	
	// Palavra super:
	//		� poss�vel chamar a implementa��o da superclasse usando a palavra super.
	// 		Exemplo: 
	//			suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0.
	//		@Override 
	//		public void withdraw(double amount) { 
	//			super.withdraw(amount); 
	//			balance -= 2.0; 
	//		}

	// Classes e m�todos final
	//		� Palavra chave: final
	//		� Classe: evita que a classe seja herdada
	//			public final class SavingsAccount {
	//		� M�todo: evita que o m�todo sob seja sobreposto
	//		� Exemplo -Classe final
	//			- Suponha que voc� queira evitar que sejam criadas subclasses de SavingsAccount
	//				public final class SavingsAccount { (...)
	
	// Exemplo - m�todo final:
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

	// Classes abstratas
	//		� S�o classes que n�o podem ser instanciadas
	//		� � uma forma de garantir heran�a total: somente subclasses n�o abstratas podem ser instanciadas, mas nunca a superclasse abstrata
	// Exemplo:
	// 		Account acc = new Account(100, "Douglas", 0.01); -> n�o pode ser instaciado a classe Account por que � abstrata.
	// 		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0); -> � permitido instaciar a subclasse de Accout que � a classe 
	//			BusinessAccout.
	
	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccout(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccout(1005, "Anna", 500.0, 500.0));

		// Totalizando o total das contas juntas.
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		// para cada conta -> (Account) - c na minha lista adcionar 10.
		for (Account acc : list) {
			acc.deposit(10.0);
		}

		// mostra a atualiza��o de cada conta com os 10 somado.
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");

		//Account acc = new Account(100, "Douglas", 0.01);
		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0);
		
		//Account acc6 = new Account(105, "Douglas Coelho", 1000.0);
		//acc6.withdraw(200.0);
		//System.out.println(acc6.getBalance());
		
		// N�o desconta a taxa de 5 por causa da sobreposi��o de m�todo @Override.
		Account acc7 = new SavingsAccount(103, "Leticia Martins", 1000.0, 0.1);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		// desconta a taxa de 5 da superclasse - Account e mais 2 da subclasse BusinessAccout, por causa da sobreposi��o de m�todo @Override.
		Account acc8 = new BusinessAccout(104, "Bob", 1000.0, 0.1);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

		// UPCASTING
		Account acc1 = bacc; // est� sendo Atribuindo um objeto da subclasse para uma variavel da superclasse.
		Account acc2 = new BusinessAccout(1003, "Bob", 0.0, 200.0);// Atribuindo um objeto da subclasse para uma variavel da superclasse.
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);// Atribuindo um objeto da subclasse para uma variavel da superclasse.
		
		// DOWNCASTING
		BusinessAccout acc4 = (BusinessAccout) acc2; // for�a a convers�o da superclasse para subclasse temos que fazer um cast manual.
		acc4.loan(100.0);

		// BusinessAccout acc5 = (BusinessAccout) acc3; // Errado, tipo difer�nte.

		// Fazer o teste se a classe � do tipo certo para cast
		if (acc2 instanceof BusinessAccout) {
			BusinessAccout acc5 = (BusinessAccout) acc2; // Atribuindo um objeto da subclasse para uma variavel da superclasse.
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		// Fazer o teste se a classe � do tipo certo para cast
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3; // Atribuindo um objeto da subclasse para uma variavel da superclasse.
			acc5.updateBalance();
			System.out.println("Update!");
		}

		System.out.println("-----------------------------------------------------------------------------------------------------------------");

		// CLASSE CAO
		Cao cao = new Cao();

		cao.correr();
		cao.latir();

		cao.setCor("Marron");

		System.out.println(cao.getCor());

		// CLASSE PASSARO
		Passaro passaro = new Passaro();

		passaro.correr();
		passaro.voar();

		passaro.setCor("Laranja");

		System.out.println(passaro.getCor());

	}

}