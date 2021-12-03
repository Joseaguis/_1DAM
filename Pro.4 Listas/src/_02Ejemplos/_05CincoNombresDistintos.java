package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.DOMConfiguration;

public class _05CincoNombresDistintos {
	public static void main(String[] args) {
		// Programa que lee de teclado 5 nombres distintos
		// Si el usuario introduce un nombre que ya ha sido introducidp antes
		// no lo tendremos en Cuenta
		Scanner sc = new Scanner(System.in);
		// Seleccion almacenado los nombres en una LISTA
		ArrayList<String> l = new ArrayList<>();

		do {
			System.out.println("Nombre: ");
			String nombre = sc.next();
			if (!l.contains(nombre)) {
				l.add(nombre);
			} else {
				System.out.println("Nombre repetido");
			}
		} while (l.size() < 5);
		System.out.println(l);

		// Solucion con Array
		String[] v = new String[5];
		for (int i = 0; i < v.length;) {
			System.out.println("Nombre: ");
			String nombre = sc.next();
			// SI el nombre que se ha introducido en el array esta repetido
			boolean continuar = false;
			for (int j = 0; j < i + 1 && !continuar; j++) {
				if (nombre.equals(v[j]))
					continuar = true;
			}
			if (continuar) {
				System.out.println("Nombre repetido");
			} else {
				v[i] = nombre;
				i++;
			}
		}

	}

}
