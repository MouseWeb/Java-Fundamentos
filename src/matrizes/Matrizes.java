package matrizes;

import java.util.Scanner;

// Matrizes:
//		• Em programação, "matriz" é o nome dado a arranjos bidimensionais 
//			• Atenção: "vetor de vetores"
//		• Arranjo (array) é uma estrutura de dados: 
//			• Homogênea (dados do mesmo tipo) 
//			• Ordenada (elementos acessados por meio de posições) 
//			• Alocada de uma vez só, em um bloco contíguo de memória
//		• Vantagens: 
//			• Acesso imediato aos elementos pela sua posição 
//		• Desvantagens: 
//			• Tamanho fixo 
//			• Dificuldade para se realizar inserções e deleções

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Leitura do valor -> n
		int n = sc.nextInt();

		// Matriz 
		int[][] mat = new int[n][n];
		
		// primeiro FOR pecorrer as linhas
		for (int i=0; i<mat.length; i++) {

			// para cada linha temos um novo for pecorrendo as colunas
			for (int j=0; j<mat[i].length; j++) {

				mat[i][j] = sc.nextInt();

			}

		}

		// Mostra o valor em diagonal
		System.out.println("Main diagonal:");

		for (int i=0; i<mat.length; i++) {

			// Imprime sempre o mesmo elemento na mesma linha -> i e coluna -> i.
			System.out.print(mat[i][i] + " ");

		}

		System.out.println();

		int count = 0;
		// Soma todos os números negativos da matriz
		for (int i=0; i<mat.length; i++) {

			for (int j=0; j<mat[i].length; j++) {

				if (mat[i][j] < 0) {

					count++;

				}

			}

		}

		System.out.println("Negative numbers = " + count);

		sc.close();

	}

}
