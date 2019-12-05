package abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstratas.entities.Circle;
import abstratas.entities.Rectangle;
import abstratas.entities.Shape;
import abstratas.entities.enums.Color;

public class Abstratas {
	
	//	Métodos abstratos:
	//		• São métodos que não possuem implementação.
	//		• Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação.
	//		• Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
	//		• Notação UML: itálico
	//		• Exercício resolvido

	// Classes abstratas:
	//		• São classes que não podem ser instanciadas
	//		• É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata
	// Exemplo:
	// 		Account acc = new Account(100, "Douglas", 0.01); -> não pode ser instaciado a classe Account por que é abstrata.
	// 		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0); -> é permitido instaciar a subclasse de Accout que é a classe 
	//			BusinessAccout.


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));

			}

			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));

			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS:");

		// para cada Shape que contém shape na lista imprimir na tela.
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));

		}
		
		sc.close();
	}
}
