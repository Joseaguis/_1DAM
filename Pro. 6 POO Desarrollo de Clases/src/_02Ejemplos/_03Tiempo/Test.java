package _02Ejemplos._03Tiempo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La version 1 tiene un problema: no tenemos control sobre que valores toman
 * los atributos
 * 
 * Modificar el programa para que si el instante de tiempo onstroducción es
 * incorrecto la vuelve a pedir
 */

public class Test {
	static Scanner sc = new Scanner(System.in);

	// Pedir al usuario hora de entrada y hora de salida que tiene que
	// ser distintas
	public static void main(String[] args) {
		Tiempo test = new Tiempo ("12/45/25");
		System.out.println(test.toString());
		Tiempo entrada, salida;
		do {
			System.out.println("Hora de entrada: ");
			entrada = leerTiempo();

			System.out.println("Hora de salida: ");
			salida = leerTiempo();
			if (entrada.equals(salida)) {
				System.out.println("Las horas tienen que ser distintas");
			}
		} while (entrada.equals(salida));
		System.out.println("Entrada: " + entrada.toString());
		System.out.println("Salida: " + salida.toString());

	}

	public static Tiempo leerTiempo() {
		Tiempo t;

		System.out.println("Hora: ");
		int h = sc.nextInt();

		System.out.println("Minuto: ");
		int m = sc.nextInt();

		System.out.println("Segundo: ");
		int s = sc.nextInt();
		t = new Tiempo(h, m, s);

		return t;

	}
}
