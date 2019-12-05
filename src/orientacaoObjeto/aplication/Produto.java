package orientacaoObjeto.aplication;

import java.util.Scanner;
import orientacaoObjeto.entities.ProdutoEntities;

// Classe Object -> Tobda classe em java é uma subclasse da classe Object.
//                  Object possui os seguintes métodos: 
// 					• getClass-retorna o tipo do objeto 
//					• equals-compara se o objeto é igual a outro 
//					• hashCode-retorna um código hashdo objeto 
//					• toString-converte o objeto para string
//
// Uma Classe ela possui Membros -> esse Membros são atributos e métodos.
//

public class Produto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProdutoEntities produtoEntities = new ProdutoEntities();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		produtoEntities.name = sc.nextLine();

		System.out.println("Price: ");
		produtoEntities.price = sc.nextDouble();

		System.out.println("Quantity in Stock: ");
		produtoEntities.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + produtoEntities);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produtoEntities.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produtoEntities);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produtoEntities.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produtoEntities);
		sc.close();

		sc.close();

	}

}
