package excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {
	
	//	Bloco finally:
	//		� � um bloco que cont�m c�digo a ser executado independentemente de ter ocorrido ou n�o uma exce��o. 
	//		� Exemplo cl�ssico: fechar um arquivo, conex�o de banco de dados, ou outro recurso espec�fico ao final do processamento.
	//	Sintaxe:
	//		try {
	//		} catch (ExceptionType e) {
	//
	//		} finally {
	//        - o c�digo que estiver aqui dentro vai executa independente do Try-Catch.
	//		}

	public static void main(String[] args) {
		
		File file = new File("C:\\Douglas\\Anotacoes.txt"); // Abrir um arquivo texto.
		
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // pecorrendo as linhas para imprimir na tela
				System.out.println(sc.nextLine());
				
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			
			System.out.println("Finally block executed");
		}
		
	}
}
