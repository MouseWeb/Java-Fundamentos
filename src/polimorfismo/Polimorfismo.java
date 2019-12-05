package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import polimorfismo.entities.Employee;
import polimorfismo.entities.OutsourcedEmployee;

public class Polimorfismo {
	
	// Pilares da OOP:
	//		• Encapsulamento
	//		• Herança
	//		• Polimorfismo

	// Polimorfismo: siginifica muitas -> formas.
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}

		}

		System.out.println();
		System.out.println("PAYMENTS:");

		// para cada funcionario na minha lista emp vai imprimir o nome e pagamento do funcionario.
		for (Employee emp : list) {

			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));

		}

		sc.close();

	}

}
