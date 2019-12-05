package heranca;

import java.util.ArrayList;
import java.util.List;

import heranca.entities.Account;
import heranca.entities.BusinessAccout;
import heranca.entities.SavingsAccount;

public class HerancaPrincipal {

	// Herança:
	// 		• É um tipo de associação que permite que uma classe herde todosdados e comportamentos de outra
	// 		• Definições importantes
	// 	• Vantagens:
	// 		• Reuso
	// 		• Polimorfismo
	// 	• Sintaxe:
	// 		• classA extendsB = a classe A vai herda tudo o que a classe B tem dados e comportamentos.
	// 		- Herança permite o reuso de atributos e métodos (dados e comportamento)

	// 	• Relação "é-um"
	// 	• Generalização/especialização
	// 	• Superclasse (classe base) / subclasse (classe derivada)
	// 	• Herança / extensão
	// 	• Herança é uma associação entre classes (e não entre objetos): quando intancia uma das classe
	// 		vai ter apenas um objeto por que uma classe extend a outra classe, herda os dados e comportamento.

	// Sobreposição ou sobrescrita:
	// 		• É a implementação de um método de uma superclasse na subclasse
	// 		• É fortemente recomendável usar a anotação @Overrideem um método sobrescrito
	// 			• Facilita a leitura e compreensão do código
	// 			• Avisamos ao compilador (boa prática)
	// 			• @Overrideem: é uma anotação que indentifica que é um método sobre-posto e sobrescrito
	// 	Classe Account:
	// 			public void withdraw(double amount) { 
	//				balance -= amount + 5.0; 
	//			}
	// 	Clasee SavingsAccount:
	// 			@Override -> vai sobrescrever o metodo da classe, 
	//			public void withdraw(double amount) { 
	//				balance -= amount; // Implementado diferente da superclasse, não desconta o valor 5.0.
	//		}
	
	// Palavra super:
	//		É possível chamar a implementação da superclasse usando a palavra super.
	// 		Exemplo: 
	//			suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0.
	//		@Override 
	//		public void withdraw(double amount) { 
	//			super.withdraw(amount); 
	//			balance -= 2.0; 
	//		}

	// Classes e métodos final
	//		• Palavra chave: final
	//		• Classe: evita que a classe seja herdada
	//			public final class SavingsAccount {
	//		• Método: evita que o método sob seja sobreposto
	//		• Exemplo -Classe final
	//			- Suponha que você queira evitar que sejam criadas subclasses de SavingsAccount
	//				public final class SavingsAccount { (...)
	
	// Exemplo - método final:
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

	// Classes abstratas
	//		• São classes que não podem ser instanciadas
	//		• É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata
	// Exemplo:
	// 		Account acc = new Account(100, "Douglas", 0.01); -> não pode ser instaciado a classe Account por que é abstrata.
	// 		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0); -> é permitido instaciar a subclasse de Accout que é a classe 
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

		// mostra a atualização de cada conta com os 10 somado.
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");

		//Account acc = new Account(100, "Douglas", 0.01);
		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0);
		
		//Account acc6 = new Account(105, "Douglas Coelho", 1000.0);
		//acc6.withdraw(200.0);
		//System.out.println(acc6.getBalance());
		
		// Não desconta a taxa de 5 por causa da sobreposição de método @Override.
		Account acc7 = new SavingsAccount(103, "Leticia Martins", 1000.0, 0.1);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		// desconta a taxa de 5 da superclasse - Account e mais 2 da subclasse BusinessAccout, por causa da sobreposição de método @Override.
		Account acc8 = new BusinessAccout(104, "Bob", 1000.0, 0.1);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

		// UPCASTING
		Account acc1 = bacc; // está sendo Atribuindo um objeto da subclasse para uma variavel da superclasse.
		Account acc2 = new BusinessAccout(1003, "Bob", 0.0, 200.0);// Atribuindo um objeto da subclasse para uma variavel da superclasse.
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);// Atribuindo um objeto da subclasse para uma variavel da superclasse.
		
		// DOWNCASTING
		BusinessAccout acc4 = (BusinessAccout) acc2; // força a conversão da superclasse para subclasse temos que fazer um cast manual.
		acc4.loan(100.0);

		// BusinessAccout acc5 = (BusinessAccout) acc3; // Errado, tipo diferênte.

		// Fazer o teste se a classe é do tipo certo para cast
		if (acc2 instanceof BusinessAccout) {
			BusinessAccout acc5 = (BusinessAccout) acc2; // Atribuindo um objeto da subclasse para uma variavel da superclasse.
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		// Fazer o teste se a classe é do tipo certo para cast
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