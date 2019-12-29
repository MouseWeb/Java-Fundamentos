package tipos_curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TipoCuringa {
	
	//	Genericss�o invariantes
	//		List<Object> n�o � o supertipo de qualquer tipo de lista:
	//			List<Object> myObjs = new ArrayList<Object>(); 
	//			List<Integer> myNumbers = new ArrayList<Integer>(); 
	//			myObjs = myNumbers; // erro de compila��o, n�o podemos atribuit por que o tipo Object n�o � um sub tipo de Integer.
	
	//	O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga:
	//		List<?> myObjs = new ArrayList<Object>(); 
	//		List<Integer> myNumbers = new ArrayList<Integer>(); 
	//		myObjs = myNumbers;
	
	// Integer � um Object, s� que List de Integer n�o � um List Object.
	// Tipo de List
	
	// Com tipos curinga podemos fazer m�todos que recebem um gen�rico de "qualquer tipo":
	
	// Por�m n�o � poss�vel adicionar dados a uma cole��o de tipo curinga, da erro de compila��o.
	//		O compilador n�o sabe qual � o tipo espec�fico do qual a lista foi instanciada.

	public static void main(String[] args) {
		
//		O supertipo de qualquer tipo de lista � (List<?>). Este � um tipo curinga:
		List<?> myObjs = new ArrayList<Object>(); 
		List<Integer> myNumbers = new ArrayList<Integer>(); 
		myObjs = myNumbers;
		
//		List<Object> n�o � o supertipo de qualquer tipo de lista:
		List<Object> myObjs1 = new ArrayList<Object>(); 
		List<Integer> myNumbers1 = new ArrayList<Integer>(); 
		//myObjs1 = myNumbers1; // erro de compila��o, n�o podemos atribuir por que o tipo Object n�o � um sub tipo de Integer.
		
//  --------------------------------------------------------------------------------------------------------------------------------
		
		List<Integer> myInts = Arrays.asList(5, 2, 10); 
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Douglas", "Leticia", "Bob"); 
		printList(myStrs);

	}
	
	// M�todo que imprimir uma List de qualquer tipo.
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	
}
