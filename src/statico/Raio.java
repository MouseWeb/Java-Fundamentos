package statico;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjeto.entities.utilities.CalcularRaioUtil;

//	Membros estáticos:
//		• Também chamados membros de classe 
//		• Em oposição a membros e instância 
//		• São membros que fazem sentido independentemente de objetos.
//			Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
//		• Aplicações comuns:
//			- Classes utilitárias --> Exemplo: Math = class, sqrt = método da classe Math -> Math.sqrt(double).
//			- Declaração de constantes 
//		• Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.
//
//  Dentro da mesma classe vc não pode chamar um método que não seja STATICO dentro de um método STATICO como o MAIN, 
//  só poderá se for instanciado um obj. 

public class Raio {

	public static void main(String[] args) { 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = CalcularRaioUtil.circumference(radius);
		double v = CalcularRaioUtil.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalcularRaioUtil.PI);
		
		sc.close();
	}

}
