package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	
	//	Estrutura try-catch:
	//		� Bloco try:
	//			� Cont�m o c�digo que representa a execu��o normal do trecho de c�digo que podeacarretar em uma exce��o
	//		� Bloco catch;
	//			� Cont�m o c�digo a ser executado caso uma exce��o ocorra 
	//			� Deve ser especificado o tipo da exce��o a ser tratada (upcasting� permitido)
	//
	// 	Sintaxe:
	//		try { 			
	//          -> Ter� o c�digo que pode ger� uma ou mais exce��es.
	//		} catch (ExceptionType e) { // () -> colocar� o tipo da exce��o que quer capitur�.
	//          -> Aqui poder� colocar alguma l�gica para execultar caso essa exce��o tenha sido executada.
	//		} catch (ExceptionType e) {
	//
	//		} catch (ExceptionType e) {
	//
	//		}
	//
	//  TRY -> Significa = Tenta, tenta executar o c�d. 
	//  CATCH -> Significa = Capiturar a exce��o e execulta alguma l�gica.

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid position!");
			e.printStackTrace(); // Mostra toda a chamada de m�todos que acarreta na exce��o.
			sc.next();
			
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
		
	}

}
