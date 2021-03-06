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
		
		Tiempo test = new Tiempo("23:42:12");
		Tiempo test2 = new Tiempo("24::42:72");
		Tiempo test3 = new Tiempo("a:dah/a");
		System.out.println(test.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		
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

		int h = 0, m = 0, s = 0;
		boolean ok = false;
		Tiempo t = null;
		
		do {
			try {
				System.out.println("Hora: ");
				h = sc.nextInt();

				System.out.println("Minuto: ");
				m = sc.nextInt();

				System.out.println("Segundo: ");
				s = sc.nextInt();
				
				t = new Tiempo(h, m, s);

				ok = true;

			} catch (InputMismatchException e) {
				System.out.println("El dato tiene que ser entero");
				sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("No pasarse del maximo valor");
			}
		} while (!ok);

		
		return t;

	}
}
