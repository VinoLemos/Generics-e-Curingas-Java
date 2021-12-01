package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class CuringasDelimitados {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();

		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total Area: " + totalArea(myShapes));
		System.out.println("Circle total area: " + totalArea(myCircles));
	}

//	Este método foi originalmente criado como uma lista de objetos Shape, coletando a área de cada objeto da lista,
//	e calculando a soma total dessas áreas. Porém, caso eu queira por exemplo criar uma lista de objetos Circle ou
//	Rectangle, o método abaixo não funcionará, pois foi feito para receber uma lista de SHAPE

//	Para resolver este problema, alteramos os parametros do método para receber uma Lista com tipo curinga.
//	? extends Shape = esta linha significa que a lista receberá qualquer tipo de objeto que extenda Shape.
//	Ou seja, o método aceitara qualquer tipo que seja um SUBTIPO de Shape.
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
//  Não é possível adicionar elementos à uma lista com tipo curinga delimitado
	}
}
