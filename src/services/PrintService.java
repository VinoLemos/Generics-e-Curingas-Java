package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {// Parametriza a classe para receber dados de tipo T
//	Fazendo isso, não é preciso criar uma nova classe apropriando o código para receber algum tipo específico de dado
//	Por exemplo: 
//				Uma classe com uma lista de string
//				Uma classe com uma lista de inteiros

	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}
}
