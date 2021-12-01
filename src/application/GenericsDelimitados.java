package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

//	Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas.
//	Um dois cálculos que ela precisa é encontrar o maior dentre um ocnjunto de elementos. Fazer um programa que
//	leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois mostre o mais caro deles.
//	
//	Computer, 890.50
//	IPhone X, 910.00
//	Tablet, 550.00
//
//	Most Expensive: 
//		Iphone, 910.00
public class GenericsDelimitados {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		String path = "/tmp/Produtos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
