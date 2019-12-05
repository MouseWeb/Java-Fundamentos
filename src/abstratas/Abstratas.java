package abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstratas.entities.Circle;
import abstratas.entities.Rectangle;
import abstratas.entities.Shape;
import abstratas.entities.enums.Color;

public class Abstratas {
	
	//	M�todos abstratos:
	//		� S�o m�todos que n�o possuem implementa��o.
	//		� M�todos precisam ser abstratos quando a classe � gen�rica demais para conter sua implementa��o.
	//		� Se uma classe possuir pelo menos um m�todo abstrato, ent�o esta classe tamb�m � abstrata.
	//		� Nota��o UML: it�lico
	//		� Exerc�cio resolvido

	// Classes abstratas:
	//		� S�o classes que n�o podem ser instanciadas
	//		� � uma forma de garantir heran�a total: somente subclasses n�o abstratas podem ser instanciadas, mas nunca a superclasse abstrata
	// Exemplo:
	// 		Account acc = new Account(100, "Douglas", 0.01); -> n�o pode ser instaciado a classe Account por que � abstrata.
	// 		BusinessAccout bacc = new BusinessAccout(101, "Leticia", 0.5, 400.0); -> � permitido instaciar a subclasse de Accout que � a classe 
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

		// para cada Shape que cont�m shape na lista imprimir na tela.
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));

		}
		
		sc.close();
	}
}
