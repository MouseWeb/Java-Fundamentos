package interfaces.defaull_methods.application;

import java.util.Locale;
import java.util.Scanner;

import interfaces.defaull_methods.services.BrazilInterestService;
import interfaces.defaull_methods.services.InterestService;

//	Considera��es importantes
//		� Sim: agora as interfaces podem prover reuso
//		� Sim: agora temos uma forma de heran�a m�ltipla 
//			� Mas o compilador reclama se houver mais de um m�todo com a mesma assinatura, obrigando a sobrescreve-lo
//		� Interfaces ainda s�o bem diferentes de classes abstratas. Interfaces n�o possuem recursos tais como construtores e atributos.

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}
