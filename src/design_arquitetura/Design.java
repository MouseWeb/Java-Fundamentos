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
	// 		� Em um sistema orientado a objetos, de modo geral "tudo" � objeto.
	// 		� Por quest�es de design tais como organiza��o, flexibilidade, reuso,
	// 			delega��o, etc., h� v�rias categorias de classes:
	// 	Entities = Entidades de neg�cio tais como produtos, clientes, pedidos.
	// 	Controllers = um controlador � o cara que faz o meio de campo entre a tela e o sistema.
	// 	Views = Telas do sistema, intera��o com usu�rio.
	// 	Services = regra de negocio do sistema e EndPoint's.
	// 	Repositories = s�o objetos responsaveis por acessar os dados de um banco de dados.

	// Composi��o:
	// 		� � um tipo de associa��o que permite que um objeto contenha outro
	// 		� Rela��o "tem-um" ou "tem-v�rios"
	// 	� Vantagens:
	// 		� Organiza��o: divis�o de responsabilidades = dividi seu sistema em responsabilidades, cada Class tem a sua responsabilidade.
	// 	� Coes�o = cada Objeto � responsavel por uma �nica coisa, o obj tem uma responsabilidade simples e bem definida,
	//			 n�o devemos misturar varioas coisa no mesmo lugar, cada Obj tem sua responsabilidade espec�fica.
	// 	� Flexibilidade = trabalha em um projeto que est� dividido em partes � mais f�cil do que trabalhar em um que est� mal dividido.
	// 	� Reuso = o mesmo objeto pode ser reaproveitado em mais de um lugar.
	// 	� Nota: embora o s�mbolo UML para composi��o (todo-parte) seja o diamante preto, neste contexto estamos chamando de composi��o
	// 		qualquer associa��o tipo "tem-um" e "tem-v�rios".

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
