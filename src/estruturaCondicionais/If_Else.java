package estruturaCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		boolean teste = true;
		int media = 11;

		// IF -> (SE)
		// ( ) -> (CONDIÇÃO)
		// ELSE -> (SENÃO)

		if (media < 6) {
			System.out.println("REPROVADO");
		} else if (media >= 6 && media <= 8) {
			System.out.println("APROVADO");
		} else if (media >= 8) {
			System.out.println("EXCELENTE");
		} else {
			System.out.println("ERRO");
		}

		if (true || false) {
			System.out.println("VERDADEIRO");
		}

		/////////////////////////////////////////////////

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}
		sc.close();

	}
}