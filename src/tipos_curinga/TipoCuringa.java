package tipos_curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TipoCuringa {
	
	//	Genericssão invariantes
	//		List<Object> não é o supertipo de qualquer tipo de lista:
	//			List<Object> myObjs = new ArrayList<Object>(); 
	//			List<Integer> myNumbers = new ArrayList<Integer>(); 
	//			myObjs = myNumbers; // erro de compilação, não podemos atribuit por que o tipo Object não é um sub tipo de Integer.
	
	//	O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
	//		List<?> myObjs = new ArrayList<Object>(); 
	//		List<Integer> myNumbers = new ArrayList<Integer>(); 
	//		myObjs = myNumbers;
	
	// Integer é um Object, só que List de Integer não é um List Object.
	// Tipo de List
	
	// Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":
	
	// Porém não é possível adicionar dados a uma coleção de tipo curinga, da erro de compilação.
	//		O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.

	public static void main(String[] args) {
		
//		O supertipo de qualquer tipo de lista é (List<?>). Este é um tipo curinga:
		List<?> myObjs = new ArrayList<Object>(); 
		List<Integer> myNumbers = new ArrayList<Integer>(); 
		myObjs = myNumbers;
		
//		List<Object> não é o supertipo de qualquer tipo de lista:
		List<Object> myObjs1 = new ArrayList<Object>(); 
		List<Integer> myNumbers1 = new ArrayList<Integer>(); 
		//myObjs1 = myNumbers1; // erro de compilação, não podemos atribuir por que o tipo Object não é um sub tipo de Integer.
		
//  --------------------------------------------------------------------------------------------------------------------------------
		
		List<Integer> myInts = Arrays.asList(5, 2, 10); 
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Douglas", "Leticia", "Bob"); 
		printList(myStrs);

	}
	
	// Método que imprimir uma List de qualquer tipo.
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	
}
