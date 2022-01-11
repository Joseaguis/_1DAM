package _02Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _02EvitarExcepciones {
	public static void main(String[] args) {
		int[] numeros = { 50, 10, 2, 0, 1, 5 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos a dividir dos elementos del array" + Arrays.toString(numeros));

		System.out.println("Posición del dividendo: ");
		int posDividendo = sc.nextInt();

		if (posDividendo >= 0 && posDividendo >= 0) {
			System.out.println("Posición del divisor: ");
			int posDivisor = sc.nextInt();
			if (posDivisor >= 0 && posDivisor < numeros.length) {
				if (numeros[posDivisor] != 0) {
					int cociente = numeros[posDividendo] / numeros[posDivisor];
					System.out.println("Cociente: " + cociente);
				} else {
					System.out.println("No se puede dividir entre 0");
				}

			} else {
				System.out.println("Posición del divisor incorrecta");
			}

		} else {
			System.out.println("Posición del dividendo incorrecta");
		}
		/*
		 * Al introducir texto aparece java.util.InputMismatchException Al salirse del
		 * array java.lang.ArrayIndexOutOfBoundsException Al dividir entre 0
		 * java.lang.ArithmeticException: / by zero
		 */
	}
}
