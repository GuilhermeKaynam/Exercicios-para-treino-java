package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {

		// Cria a Collection Arraylist, do tipo Double, chamada nota

		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite primeira nota: ");
		notas.add(scanner.nextDouble());

		notas.add(7.0); // caso eu já queira guardar
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("\nNotas cadastradas - laço For...Each");

		for (Double nota : notas) {
			if (nota % 2 == 0) {
				System.out.println(nota);
			}

		}

		notas.add(10.5);
		System.out.println(notas);

		System.out.println("Qual a nota você quer conferir?");
		System.out.println("\n Nota 7.5 está na lista? " + notas.contains(scanner.nextDouble()));

		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5.0d));

		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5.0));

	}

}
