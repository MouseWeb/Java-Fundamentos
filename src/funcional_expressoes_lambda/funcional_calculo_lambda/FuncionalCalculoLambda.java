package funcional_expressoes_lambda.funcional_calculo_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import curingas_delimitados.application.Program;
import map.entities.Product;

public class FuncionalCalculoLambda {
	
	//	Transparência referencial
	//		Uma função possui transparência referencial se seu resultado for sempre o mesmo paraosmesmosdadosdeentrada.
	//		Benefícios:simplicidadeeprevisibilidade

	//	Exemplo de função que não é referencialmente transparente
	
	//	Funções são objetos de primeira ordem (ou primeira classe):
	//		Isso significa que funções podem, por exemplo, serem passadas como parâmetros de métodos, 
	//		bem como retornadas como resultado de métodos.
	
	//	O que são "expressões lambda"?
	//		Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe.
	
	//	Cálculo Lambda = formalismo matemático base da programação funcional
	//	Expressão lambda = função anônima de primeira classe

	// Atributo static
	public static int globalValue = 3;
	
	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		
		System.out.println("-------------------------------------------------------------------------------");
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00)); list.add(new Product("Notebook", 1200.00)); list.add(new Product("Tablet", 450.00));
		
		//list.sort(Program::compareProducts);
		list.forEach(System.out::println);

	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

}
