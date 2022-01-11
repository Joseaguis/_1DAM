package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04RecuperarseDeExcepcion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int edad;
		boolean ok = false;
		do {
			try {
				System.out.println("Introduzca edad: ");
				edad = sc.nextInt();
				ok = true;
				if (edad >= 18) {
					System.out.println("Mayor de edad");
				} else {
					System.out.println("Menor de edad");
				}
			} catch (InputMismatchException e) {
				System.out.println("La edad debe ser un numero entero");
				sc.nextLine();
			}
		} while (!ok);
		System.out.println("Fin del Programa");
	}
}
