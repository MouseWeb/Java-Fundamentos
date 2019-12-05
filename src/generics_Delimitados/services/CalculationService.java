package generics_Delimitados.services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar vazia");
		} 

		// Algoritimo para encontrar o maior elemento dentro de uma lista.
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}

		}
		return max;
	}
}
