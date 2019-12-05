package curingas_delimitados.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Get_Put {
	
	//	Problema 2 (princ�pio get/put)
	//		Vamos fazer um m�todo que copia os elementos de uma lista para uma outra lista que pode ser mais gen�rica que a primeira.
	//			List<Integer> myInts = Arrays.asList(1, 2, 3, 4); 
	//			List<Double> myDoubles = Arrays.asList(3.14, 6.28); 
	//			List<Object> myObjs = new ArrayList<Object>();
	//				copy(myInts, myObjs);
	//				copy(myDoubles, myObjs);
	
	//	Princ�pio get/put-covari�ncia
	//		List<Integer> intList = new ArrayList<Integer>(); 
	//			intList.add(10); 
	//			intList.add(5);
	//		List<? extends Number> list = intList;
	//			Number x = list.get(0);
	//			list.add(20); // erro de compilacao
	//	get-OK
	//	put-ERROR
	
	//	Princ�pio get/put-contravari�ncia
	//		List<Object> myObjs = new ArrayList<Object>(); 
	//			myObjs.add("Maria"); 
	//			myObjs.add("Alex");
	//		List<? super Number> myNums = myObjs;
	//			myNums.add(10); 
	//			myNums.add(3.14);
	//			Number x = myNums.get(0); // erro de compilacao
	//	get-ERROR
	//	put-OK

	public static void main(String[] args) {
	
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
