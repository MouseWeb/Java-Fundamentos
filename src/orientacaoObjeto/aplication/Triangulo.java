package orientacaoObjeto.aplication;

import java.util.Locale;
import java.util.Scanner;
import orientacaoObjeto.entities.TrianguloEntities;

public class Triangulo {
	
	// �rea das Mem�ria em Orienta��o a Objeto:
	// Stack -> �rea onde s�o criadas as variaveis staticas que s�o as variaveis declaradas no programa.
	// Hearp -> durante a execu��o do programa podemos fazer uma aloca��o den�mica de mem�ria usando a instacia��o de OBJ/Class.java - new Class.
	//          No momento que fasso | x = new TrianguloEntities(); | vai ser criado/instaciado um Objeto do tipo | TriTrianguloEntities | na �rea
	//          de mem�ria chamada -> Hearp <- essa �rea da mem�ria � onde s�o criado os Objetos din�micos durante a execu��o do programa.
	// Variavel X existe na Stack -> X n�o tem os dados do triangulo.
	//                               a variavel armazena o endere�o de memoria do Objeto que foi criado na �rea de mem�ria | Hearp |.
	//                               a variavel X � uma referencia para um Objeto que est� armazenado na �rea de memoria | Hearp |.
	// Classe -> � a defini��o do tipo.
	// Objeto -> s�o inst�ncias da classe | Obj -> X e Obj -> Y s�o Objetos/Instacias da classe que tem ATRIBUTOS -> A, B e C do Tipo Triangulo. 
	// Em Java, tipos primitivos s�o tipos valor. Tipos valor s�o CAIXAS e n�o ponteiros. 
	
	// ----------------------------------------------------------------------------------------------------------------------------------------
	
	// Garbagecollector:
	// 	� � um processo que automatiza o gerenciamento de mem�ria de um programa em execu��o
	// 	� O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap),
	//                                                                                desalocando aqueles que n�o est�o mais sendo utilizados.
	// 	- Um objeto que est� sem referencia -> ser� desalocado pelo garbage collector em um futuro muito pr�ximo e libera o espaco em m�moria.
	//
	// 	� Objetos alocados dinamicamente, quando n�o possuem mais refer�ncia para eles,ser�o desalocados pelo garbagecollector
	// 	� Vari�veis locais s�o desalocadas imediatamente assim que seu escopo local sai de execu��o
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TrianguloEntities x, y;
		x = new TrianguloEntities();
		y = new TrianguloEntities();
		
		System.out.println("\r\n" + "Digite as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("\r\n" + "Digite as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Tri�ngulo X �rea: %.4f%n", areaX);
		System.out.printf("Tri�ngulo Y �rea: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior �rea: X");
		} else {
			System.out.println("Maior �rea: Y");
		}
		
		sc.close();

	}

}
