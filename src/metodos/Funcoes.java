package metodos;

import java.util.Scanner;

public class Funcoes {

	// Representam um processamento que possui um significado
	// Principais vantagens:
	// Modulariza��o -> Divide sua aplica��o em varias partes e modulos.
	// Delega��o -> Delega a l�gica de calcular ou execultar alguma coisa para outro
	// lugar assim deixando a aplica��o mais limpa e enchuta.
	// Reaproveitamento -> Fun��o do reaproveitamento, podendo reaproveitar uma
	// fun��o varias vezes na mesma aplica��o.
	// Dados de entrada e sa�da
	// Fun��es podem receber dados de entrada (par�metros ou argumentos)
	// Fun��es podem ou n�o retornar uma sa�da
	// Em orienta��o a objetos, fun��es em classes recebem o nome de "m�todos"

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
