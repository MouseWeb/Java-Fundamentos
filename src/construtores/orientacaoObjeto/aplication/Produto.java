package construtores.orientacaoObjeto.aplication;

import java.util.Scanner;

import construtores.orientacaoObjeto.entities.ProdutoEntities;


// Construtor:
// 			• É uma operação especial da classe, que || executa no momento da instanciação do objeto ||.
//		• Usos comuns: 
//			• Iniciar valores dos atributos 
//			• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência) 
//			• Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão: Product p = new Product(); 
//			• É possível especificar mais de um construtor na mesma classe (sobrecarga)


// Classe Object -> Toda classe em java é uma subclasse da classe Object.
//                  Object possui os seguintes métodos: 
// 					• getClass-retorna o tipo do objeto 
//					• equals-compara se o objeto é igual a outro 
//					• hashCode-retorna um código hashdo objeto 
//					• toString-converte o objeto para string
//
// Uma Classe ela possui Membros -> esse Membros são atributos e métodos.

public class Produto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Price: ");
		double price = sc.nextDouble();

//		System.out.println("Quantity in Stock: ");
//		int quantity = sc.nextInt();
		
		ProdutoEntities produtoEntities = new ProdutoEntities(name, price);

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
