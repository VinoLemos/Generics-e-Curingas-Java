package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//	Fazer um método que copia os elementos de uma lista para uma outra lista que pode ser mais genérica que a primeira.
public class Ex02CuringasDelimitados {

	public static void main(String[] args) {

	List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	List<Double> myDoubles = Arrays.asList(3.14, 6.28);
	List<Object> myObjs = new ArrayList<Object>();
		
	copy(myInts, myObjs);//Copia os elementos da lista específica para a lista genérica
	printList(myObjs);
	copy(myDoubles, myObjs);
	printList(myObjs);//Copia e adiciona os elementos da lista específica para a lista genérica
	
	}
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		for (Number number : source) {
			destiny.add(number);
		}
	}
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
	
}
