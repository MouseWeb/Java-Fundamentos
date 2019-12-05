package Loops;

import java.util.Locale;
import java.util.Scanner;

public class Loops {

	// WHILE -> (ENQUANTO) ELE VERIFICA A CONDI��O PRIMEIRO PRA DEPOIS EXECULTA O
	// BLOCO DE NOTAS DE C�DIGO DA CHAVE
	// ( ) -> (CONDI��O)
	// + -> (OPERADOR + JUNTO COM TEXTO CONCATENA)

	// NUMERO++ -> (INCREMENTAR | CONTADOR) + 1 NO NUMERO 1 E ASSIM VAI ...LOOP

	// DO -> (FASSA OU FAZER) ELE EXECULTA O QUE ESTA NA CHAVE PRIMEIRO E EM SEGUIDA
	// ELE FAZ A VERIFICA��O DA CONDI��O.

	// FOR -> (CONTADOR | CONDI��O | INCREMENTAR) FAZ A A��O DA SINTAZE NA MESMA
	// LINHA

	public static void main(String[] args) {

		int numero = 0;

		while (numero < 0) { // WHILE -> (ENQUANTO)
			System.out.println("Loop" + numero);
			numero++;
		}

		do { // DO -> (FASSA OU FAZER)
			System.out.println("Loop" + numero);
			numero++;
		} while (numero < 0);

		for (int n = 0; n <= 5; n++) { // FOR -> (CONTADOR | CONDI��O | INCREMENTAR)
			System.out.println("Loop: " + n);
		}

		/////////////////////////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		System.out.print("\r\n" + "Quantos n�meros inteiros voc� vai entrar ?: ");

		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}

		System.out.println("Sum = " + sum);
		sc.close();

		/////////////////////////////////////////////////////////////////////////////////////

		Scanner c = new Scanner(System.in);
		System.out.print("Entrar N: ");
		
		int n1 = c.nextInt();
		
		while (n1 <= 0) {
			System.out.print("N�mero deve ser positivo! Tente novamente: ");
			n1 = c.nextInt();
		}
		
		int higher = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n1; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = c.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		
		System.out.println("Higher = " + higher);
		
		c.close();

		//////////////////////////////////////////////////////////////////////////////////////

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		char resp;

		do {
			System.out.print("\r\n" + "Digite um n�mero: ");

			double n2 = s.nextDouble();
			double sq = Math.sqrt(n2);

			System.out.printf("\r\n" + "Raiz quadrada = %.3f%n", sq);
			System.out.print("Repetir (y/n)? ");

			resp = s.next().charAt(0);

		} while (resp != 'n');

		s.close();

		//////////////////////////////////////////////////////////////////////////////////////

		Locale.setDefault(Locale.US);
		Scanner cc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		
		int n3 = cc.nextInt();
		
		for (int i = 1; i <= n3; i++) {
			System.out.print("Aluno #" + i + ": ");
			
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			double finalScore = score1 + score2 + score3;
			
			System.out.printf("Pontua��o final: %.2f%n", finalScore);
		}
		
		cc.close();

	}

}
