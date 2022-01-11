package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05LeerEdad {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int edad = leerEdad(120);
		if (edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");

	}

	/*
	 * Piede y lee edad (entera) entre 0 y valorMaximo. Si el usuario introduce un
	 * valor mayor fuera de rango o no introduce un entero, se muestra un mensaje
	 * adecuado y se vuelve a pedir
	 */
	public static int leerEdad(int valorMaximo) {
		boolean correcto = false;
		int edad = 0;

		do {
			try {
				edad = sc.nextInt();
				if (edad < valorMaximo && edad > 0) {
					correcto = true;
				} else {
					System.out.println("Introduce un numero entre 0 y " + valorMaximo);
				}

			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero entre 0 y " + valorMaximo);
				sc.nextLine();
			}
		} while (!correcto);
		return edad;

	}
}
