package heranca;

import heranca.entities.Account;
import heranca.entities.SavingsAccount;

public class Polimorfismo {
	
	// Pilares da OOP:
	//		� Encapsulamento
	//		� Heran�a
	//		� Polimorfismo

	// Polimorfismo: siginifica muitas - formas.
	//		Em Programa��o Orientada a Objetos, polimorfismo � recurso que permite que vari�veis de um mesmo tipo mais gen�rico
	//		possam apontar para objetos de tipos espec�ficos diferentes, tendo assim comportamentos diferentes conforme cada tipo espec�fico.
	
	// 		Account x = new Account(1020, "Alex", 1000.0); 
	//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
	//		x.withdraw(50.0); 
	//		y.withdraw(50.0);
	
	// Importante entender:
	//		� A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de execu��o (upcasting).
	//		� O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo Withdrawest� sendo feita 
	//			(ele s� sabe que s�o duas vari�veis tipo Account):
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
