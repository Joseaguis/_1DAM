package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_2Edades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean correcto = false;
		int edades[] = new int[5];
		try {
			do {

				double sumaEdad = 0;
				for (int i = 0; i < edades.length; i++) {
					System.out.println("Edad " + (i + 1));
					edades[i] = sc.nextInt();
					sumaEdad += edades[i];
				}
				System.out.println("Media de la edad: " + (sumaEdad / edades.length));
				correcto = true;

			} while (!correcto);
		} catch (

		InputMismatchException e) {
			System.err.println("Edad mal introducido: Termina el programa");
			sc.next();
		}
	}
}
