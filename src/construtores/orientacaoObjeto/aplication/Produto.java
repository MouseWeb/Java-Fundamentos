package construtores.orientacaoObjeto.aplication;

import java.util.Scanner;

import construtores.orientacaoObjeto.entities.ProdutoEntities;


// Construtor:
// 			� � uma opera��o especial da classe, que || executa no momento da instancia��o do objeto ||.
//		� Usos comuns: 
//			� Iniciar valores dos atributos 
//			� Permitir ou obrigar que o objeto receba dados / depend�ncias no momento de sua instancia��o (inje��o de depend�ncia) 
//			� Se um construtor customizado n�o for especificado, a classe disponibiliza o construtor padr�o: Product p = new Product(); 
//			� � poss�vel especificar mais de um construtor na mesma classe (sobrecarga)


// Classe Object -> Toda classe em java � uma subclasse da classe Object.
//                  Object possui os seguintes m�todos: 
// 					� getClass-retorna o tipo do objeto 
//					� equals-compara se o objeto � igual a outro 
//					� hashCode-retorna um c�digo hashdo objeto 
//					� toString-converte o objeto para string
//
// Uma Classe ela possui Membros -> esse Membros s�o atributos e m�todos.

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
