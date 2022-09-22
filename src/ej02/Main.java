package ej02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Contacto> contactos = new ArrayList<Contacto>();

		while (true) {

			System.out.println("DNI del nuevo contacto: ");
			String dni = input.nextLine().toUpperCase();

			if (dni.equals("*")) {
				break;
			}

			System.out.println("Nombre del nuevo contacto: ");
			String nombre = input.nextLine();

			System.out.println("Apellidos del nuevo contacto: ");
			String apellidos = input.nextLine();

			System.out.println("Telefono del nuevo contacto: ");
			String telefono = input.nextLine();

			contactos.add(new Contacto(dni, nombre, apellidos, telefono));

		}

		contactos.sort((c1, c2) -> {
			int comparacionApellidos = c1.getApellidos().compareTo(c2.getApellidos());

			if (comparacionApellidos == 0)
				return c1.getNombre().compareTo(c2.getNombre());
			return comparacionApellidos;
		});

		for (Contacto contacto : contactos) {
			System.out.println(contacto.toString());
		}

		input.close();

	}

}
