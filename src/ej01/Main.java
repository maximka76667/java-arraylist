package ej01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Double> temperaturas = new ArrayList<Double>();

		double temperaturaMaxima = Double.MIN_VALUE;
		double temperaturaMinima = Double.MAX_VALUE;
		double suma = 0;

		while (true) {
			System.out.println("Teclee temperatura (-100 para salir):");
			double temperatura = input.nextDouble();

			if (temperatura <= -100) {
				break;
			}

			if (temperatura > temperaturaMaxima) {
				temperaturaMaxima = temperatura;
			}

			if (temperatura < temperaturaMinima) {
				temperaturaMinima = temperatura;
			}

			suma += temperatura;

			temperaturas.add(temperatura);
		}

		// Ordenadas de mayor a menor
		temperaturas.sort((a, b) -> (int) (b - a));

		// Mostrar por pantalla
		System.out.println("Temperaturas tecleadas:");

		for (int i = 0; i < temperaturas.size(); i++) {
			System.out.println(i + ". " + temperaturas.get(i));
		}

		// La temperatura máxima, mínima
		System.out.println("La temperatura máxima: " + temperaturaMaxima);
		System.out.println("La temperatura mínima: " + temperaturaMinima);

		// La temperatura media
		System.out.println("La media de todas las temperaturas es: " + (suma / temperaturas.size()));

		// Pedir una temperatura e indicar si está en la lista de temperaturas.
		System.out.println("Teclee temperatura a buscar: ");
		double temperaturaBuscar = input.nextDouble();

		int posicion = temperaturas.indexOf(temperaturaBuscar);

		if (posicion == -1) {
			System.out.println("La temperatura tecleada NO está en el arrayList");
		} else {
			System.out.println("La temperatura tecleada está en la posición: " + posicion);
		}

		input.close();
	}

}
