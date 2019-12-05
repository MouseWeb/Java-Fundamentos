package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.model.entities.Reservation;
import excecoes.model.exceptions.DomainException;

public class ExceptionPersonalisado {
	
	//	Sugest�o de pacotes "model":
	//		model = representa os dados do sistema e as tranforma��es desses dados conforme as regra de neg�cio.
	//		  |----> entities = representa as entidades de n�gocios Exemplo: produto, cliente, pedido etc.
	//		  |----> enums = Tipos enumerados.
	//		  |----> exceptions = Exces�es.
	//		  |----> services = servi�os.

	//	� Cl�usula throws: propaga a exce��o ao inv�s de trata-la
	//	� Cl�usula throw: lan�a a exce��o / "corta" o m�todo
	//	� Exception: compilador obriga a tratar ou propagar 
	//	� RuntimeException: compilador n�o obriga
	//	� O modelo de tratamento de exce��es permite que erros sejam tratados de forma consistente e flex�vel, 
	//		usando boas pr�ticas.
	//	� Vantagens: 
	//	� L�gica delegada 
	//		� Construtores podem ter tratamento de exce��es 
	//		� Possibilidade de aux�lio do compilador (Exception) 
	//		� C�digo mais simples. N�o h� aninhamentode condicionais: a qualquer momento que uma exce��o for disparada, 
	//			a execu��o � interrompida e cai no bloco catch correspondente. 
	//		� � poss�vel capturar inclusive outras exce��es de sistema.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print("Room number: ");
			int number = sc.nextInt();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);

			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();

	}

}
