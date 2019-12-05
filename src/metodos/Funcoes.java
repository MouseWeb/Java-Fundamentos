package metodos;

import java.util.Scanner;

public class Funcoes {

	// Representam um processamento que possui um significado
	// Principais vantagens:
	// Modularização -> Divide sua aplicação em varias partes e modulos.
	// Delegação -> Delega a lógica de calcular ou execultar alguma coisa para outro
	// lugar assim deixando a aplicação mais limpa e enchuta.
	// Reaproveitamento -> Função do reaproveitamento, podendo reaproveitar uma
	// função varias vezes na mesma aplicação.
	// Dados de entrada e saída
	// Funções podem receber dados de entrada (parâmetros ou argumentos)
	// Funções podem ou não retornar uma saída
	// Em orientação a objetos, funções em classes recebem o nome de "métodos"

	public static void main(String[] args) {

		//
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter three numbers:"); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt(); if (a > b && a > c) {
		 * System.out.println("Higher = " + a); } else if (b > c) {
		 * System.out.println("Higher = " + b); } else { System.out.println("Higher = "
		 * + c); } sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		
		sc.close();
		
	}

	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
