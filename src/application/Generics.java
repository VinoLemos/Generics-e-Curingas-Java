package application;

import java.util.Scanner;

import services.PrintService;

// Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros.
// Ao final, imprima esses números de forma organizada conforme exemplo. Em seguida,
// informar qual foi o primeiro valor informado.
public class Generics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter #" + (i+1) + " value: ");
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}
}
