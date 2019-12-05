package statico;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjeto.entities.utilities.CalcularRaioUtil;

//	Membros est�ticos:
//		� Tamb�m chamados membros de classe 
//		� Em oposi��o a membros e inst�ncia 
//		� S�o membros que fazem sentido independentemente de objetos.
//			N�o precisam de objeto para serem chamados. S�o chamados a partir do pr�prio nome da classe.
//		� Aplica��es comuns:
//			- Classes utilit�rias --> Exemplo: Math = class, sqrt = m�todo da classe Math -> Math.sqrt(double).
//			- Declara��o de constantes 
//		� Uma classe que possui somente membros est�ticos, pode ser uma classe est�tica tamb�m. Esta classe n�o poder� ser instanciada.
//
//  Dentro da mesma classe vc n�o pode chamar um m�todo que n�o seja STATICO dentro de um m�todo STATICO como o MAIN, 
//  s� poder� se for instanciado um obj. 

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
