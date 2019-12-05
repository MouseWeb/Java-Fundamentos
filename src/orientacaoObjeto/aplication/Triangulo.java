package orientacaoObjeto.aplication;

import java.util.Locale;
import java.util.Scanner;
import orientacaoObjeto.entities.TrianguloEntities;

public class Triangulo {
	
	// Área das Memória em Orientação a Objeto:
	// Stack -> área onde são criadas as variaveis staticas que são as variaveis declaradas no programa.
	// Hearp -> durante a execução do programa podemos fazer uma alocação denâmica de memória usando a instaciação de OBJ/Class.java - new Class.
	//          No momento que fasso | x = new TrianguloEntities(); | vai ser criado/instaciado um Objeto do tipo | TriTrianguloEntities | na área
	//          de memória chamada -> Hearp <- essa área da memória é onde são criado os Objetos dinâmicos durante a execução do programa.
	// Variavel X existe na Stack -> X não tem os dados do triangulo.
	//                               a variavel armazena o endereço de memoria do Objeto que foi criado na área de memória | Hearp |.
	//                               a variavel X é uma referencia para um Objeto que está armazenado na área de memoria | Hearp |.
	// Classe -> é a definição do tipo.
	// Objeto -> são instâncias da classe | Obj -> X e Obj -> Y são Objetos/Instacias da classe que tem ATRIBUTOS -> A, B e C do Tipo Triangulo. 
	// Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros. 
	
	// ----------------------------------------------------------------------------------------------------------------------------------------
	
	// Garbagecollector:
	// 	• É um processo que automatiza o gerenciamento de memória de um programa em execução
	// 	• O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap),
	//                                                                                desalocando aqueles que não estão mais sendo utilizados.
	// 	- Um objeto que está sem referencia -> será desalocado pelo garbage collector em um futuro muito próximo e libera o espaco em mémoria.
	//
	// 	• Objetos alocados dinamicamente, quando não possuem mais referência para eles,serão desalocados pelo garbagecollector
	// 	• Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TrianguloEntities x, y;
		x = new TrianguloEntities();
		y = new TrianguloEntities();
		
		System.out.println("\r\n" + "Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("\r\n" + "Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triângulo X área: %.4f%n", areaX);
		System.out.printf("Triângulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();

	}

}
