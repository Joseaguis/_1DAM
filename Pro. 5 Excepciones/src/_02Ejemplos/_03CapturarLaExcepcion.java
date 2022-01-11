package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03CapturarLaExcepcion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		try {
			int edad = sc.nextInt();

			if (edad >= 18) {
				System.out.println("Mayor de edad");
			} else {
				System.out.println("Menor de edad");
			}
		} catch (InputMismatchException e) {
			System.out.println("La edad debe ser un numero entero");
			e.printStackTrace();
		}
		System.out.println("Fin del Programa");
	}
}
