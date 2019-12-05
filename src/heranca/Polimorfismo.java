package heranca;

import heranca.entities.Account;
import heranca.entities.SavingsAccount;

public class Polimorfismo {
	
	// Pilares da OOP:
	//		• Encapsulamento
	//		• Herança
	//		• Polimorfismo

	// Polimorfismo: siginifica muitas - formas.
	//		Em Programação Orientada a Objetos, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico
	//		possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.
	
	// 		Account x = new Account(1020, "Alex", 1000.0); 
	//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
	//		x.withdraw(50.0); 
	//		y.withdraw(50.0);
	
	// Importante entender:
	//		• A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
	//		• O compilador não sabe para qual tipo específico a chamada do método Withdrawestá sendo feita 
	//			(ele só sabe que são duas variáveis tipo Account):
	//		Account x = new Account(1020, "Alex", 1000.0); 
	//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
	//		x.withdraw(50.0);
	//		y.withdraw(50.0);
	
	public static void main(String[] args) {
		
		//Account x = new Account(1020, "Alex", 1000.0); 
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		//x.withdraw(50.0); 
		y.withdraw(50.0);
		//System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
}
