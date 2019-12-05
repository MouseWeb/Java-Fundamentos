package saidaDados;
import java.util.Locale;
import java.util.Scanner;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, \r\n" + "qual preço é $ %.2f%n", product1, price1);
		System.out.printf("%s, \r\n" + "qual preço é $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Registro: %d anos de idade, código %d e gênero: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Mede com oito casas decimais: %.8f%n", measure);
		System.out.printf("\r\n" + "Rouded (três casas decimais): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		///////////////////////////////////////////////////////////////////////////////////
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 35
		int n1 = sc.nextInt();
		// Bob Brown
		sc.nextLine();
		String name = sc.nextLine();
		// F
		char genders = sc.next().charAt(0);
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int ages = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(genders);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(ages);
		System.out.println(height);
		sc.close();

	}
}
