package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_1dades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean correcto = false;
		int edades[] = new int[5];
		do {

			double sumaEdad = 0;
			for (int i = 0; i < edades.length;) {
				try {
					System.out.println("Edad " + (i + 1));
					edades[i] = sc.nextInt();
					sumaEdad += edades[i];
				} catch (InputMismatchException e) {
					System.out.println("Introduce unicamente numeros enteros\n");
					sc.next();
				}
			}
			System.out.println("Media de la edad: " + (sumaEdad / edades.length));
			correcto = true;

		} while (!correcto);
	}
}
