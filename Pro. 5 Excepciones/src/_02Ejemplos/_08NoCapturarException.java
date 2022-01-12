package _02Ejemplos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _08NoCapturarException {

	// EN GENERAL, no conviene capturar excepciones
	// ¿Por que? Porque va a silenciar errores de programación

	public static void main(String[] args) {
		// Programa que pide al usuario las edades de una serie de personas
		// Si el usuario no introduce un entero, el programa termina
		Scanner sc = new Scanner(System.in);
		int edades[] = new int[5];
		try {
			for (int i = 0; i < edades.length; i++) {
				System.out.println("Introduce edad " + (i + 1));
				edades[i] = sc.nextInt();
			}
		} catch (InputMismatchException e) {
			// Silenciar la excepcion
		}
		System.out.println(Arrays.toString(edades));
	}

}
