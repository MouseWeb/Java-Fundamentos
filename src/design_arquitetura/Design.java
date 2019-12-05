package design_arquitetura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import design_arquitetura.entities.Department;
import design_arquitetura.entities.HourContract;
import design_arquitetura.entities.Worker;
import design_arquitetura.entities.enums.WorkerLevel;

public class Design {

	// 	Categorias de classes:
	// 		• Em um sistema orientado a objetos, de modo geral "tudo" é objeto.
	// 		• Por questões de design tais como organização, flexibilidade, reuso,
	// 			delegação, etc., há várias categorias de classes:
	// 	Entities = Entidades de negócio tais como produtos, clientes, pedidos.
	// 	Controllers = um controlador é o cara que faz o meio de campo entre a tela e o sistema.
	// 	Views = Telas do sistema, interação com usuário.
	// 	Services = regra de negocio do sistema e EndPoint's.
	// 	Repositories = são objetos responsaveis por acessar os dados de um banco de dados.

	// Composição:
	// 		• É um tipo de associação que permite que um objeto contenha outro
	// 		• Relação "tem-um" ou "tem-vários"
	// 	• Vantagens:
	// 		• Organização: divisão de responsabilidades = dividi seu sistema em responsabilidades, cada Class tem a sua responsabilidade.
	// 	• Coesão = cada Objeto é responsavel por uma única coisa, o obj tem uma responsabilidade simples e bem definida,
	//			 não devemos misturar varioas coisa no mesmo lugar, cada Obj tem sua responsabilidade específica.
	// 	• Flexibilidade = trabalha em um projeto que está dividido em partes é mais fácil do que trabalhar em um que está mal dividido.
	// 	• Reuso = o mesmo objeto pode ser reaproveitado em mais de um lugar.
	// 	• Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição
	// 		qualquer associação tipo "tem-um" e "tem-vários".

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");

		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");

			Date contractDate = sdf.parse(sc.next());

			System.out.print("Value per hour: ");

			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");

			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);

			worker.addContract(contract);

		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");

		String monthAndYear = sc.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();

	}

}
