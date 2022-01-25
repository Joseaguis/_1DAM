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

public class Test2 {
	static Scanner sc = new Scanner(System.in);

	// Pedir al usuario hora de entrada y hora de salida que tiene que
	// ser distintas
	public static void main(String[] args) {
		
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
		
		boolean ok = false;
		Tiempo t = null;
		
		do {
			try {
			
			System.out.println("(hh:mm:ss): ");
			String s = sc.next();
			t = new Tiempo(s);
			ok = true;
			
			} catch (IllegalArgumentException e) {
				System.out.println("Formato ilegal");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Falta texto");
			} catch (InputMismatchException e) {
				// TODO: handle exception
			}
		} while (!ok);

		return t;

	}
}
