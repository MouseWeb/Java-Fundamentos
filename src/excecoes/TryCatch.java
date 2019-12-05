package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	
	//	Estrutura try-catch:
	//		• Bloco try:
	//			• Contém o código que representa a execução normal do trecho de código que podeacarretar em uma exceção
	//		• Bloco catch;
	//			• Contém o código a ser executado caso uma exceção ocorra 
	//			• Deve ser especificado o tipo da exceção a ser tratada (upcastingé permitido)
	//
	// 	Sintaxe:
	//		try { 			
	//          -> Terá o código que pode gerá uma ou mais exceções.
	//		} catch (ExceptionType e) { // () -> colocará o tipo da exceção que quer capiturá.
	//          -> Aqui poderá colocar alguma lógica para execultar caso essa exceção tenha sido executada.
	//		} catch (ExceptionType e) {
	//
	//		} catch (ExceptionType e) {
	//
	//		}
	//
	//  TRY -> Significa = Tenta, tenta executar o cód. 
	//  CATCH -> Significa = Capiturar a exceção e execulta alguma lógica.

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
			e.printStackTrace(); // Mostra toda a chamada de métodos que acarreta na exceção.
			sc.next();
			
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
		
	}

}
