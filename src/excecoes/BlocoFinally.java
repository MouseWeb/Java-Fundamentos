package excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {
	
	//	Bloco finally:
	//		• É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção. 
	//		• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.
	//	Sintaxe:
	//		try {
	//		} catch (ExceptionType e) {
	//
	//		} finally {
	//        - o código que estiver aqui dentro vai executa independente do Try-Catch.
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
