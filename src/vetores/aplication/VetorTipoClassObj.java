package vetores.aplication;

import java.util.Scanner;

import vetores.entities.Produto;

public class VetorTipoClassObj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		// vect.length -> é a quantidade de elementos dentro do vetor, 
		// 					melhor usar o length por que não fica dependendo de uma variavel que não está atrelado a o vetor,
		//                  assim o proprio vetor sabe o seu tamanho e trabalhamos de forma coesa ultilizando o | length |.
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}

}
