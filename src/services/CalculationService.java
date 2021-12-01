package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
//		Lista de tipo T (Qualquer tipo, definido no programa)
//		Retornando objeto do tipo T (T max)
//		Método trabalhando com algum tipo T ( public static <T>)
//		Tipo T é tipo comparable (public static <T extends Comparable<T>>
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
