package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalServices;

public class Interface {
	
	//	� A partir do Java 8, interfaces podem ter "default methods" ou "defender methods"
	//	� Isso possui implica��es conceituais e pr�ticas, que ser�o discutidas mais � frente neste cap�tulo
	//	� Primeiro vamos trabalhar com a defini��o "cl�ssica" de interfaces. Depois vamos acrescentar o conceito de default methods.
	
	//	Interface:
	//		- Interface � um tipo que define um conjunto de opera��es que uma classe deve implementar.
	//      - A interface estabelece um contrato que a classe deve cumprir.
	//				interface Shape {
	//					double area();
	//					double perimeter(); }
	//		- Pra qu� interfaces? 
	//			� Para criar sistemas com baixo acoplamento e flex�veis.
	
	//	Problema do diamante
	//	A heran�a m�ltipla pode gerar o problema do diamante: 
	//		uma ambiguidade causada pela exist�nciadomesmom�todoem maisdeumasuperclasse.
	//	Heran�a m�ltipla n�o � permitida na maioria das linguagens!


	public static void main(String[] args) throws ParseException  {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();
	}

}
