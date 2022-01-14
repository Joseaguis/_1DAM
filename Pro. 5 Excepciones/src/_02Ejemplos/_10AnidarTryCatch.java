package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _10AnidarTryCatch {
	// En el ejemplo 9 mostramos el mismo mensaje si introduce mal el primer dato
	// que si introduce mal el segundo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		do {
			try {
				System.out.println("Dato 1");
				int d1 = sc.nextInt();

				try {
					System.out.println("Dato 2");
					int d2 = sc.nextInt();
					try {
						System.out.println("Operacion (+, -, *, /): ");
						String op = sc.next();
						try {
							System.out.println("Resultado: " + calcular(d1, d2, op));
							ok = true;
						} catch (ArithmeticException e) {
							System.out.println("No se puede dividir entre 0");
						}
					} catch (InputMismatchException e) {
						System.out.println("Se tiene que introducir una operacion");
						sc.nextLine();
					}
				} catch (InputMismatchException e) {
					System.out.println("El segundo dato debe ser un entero");
					sc.nextLine();
				}
			} catch (InputMismatchException e) {
				System.out.println("El primer dato debe ser un entero");
				sc.nextLine();
			}
		} while (!ok);
	}

	public static int calcular(int d1, int d2, String op) {
		// En este metodo lo convieniente No es capturar la excepcion, SINO PROPAGARLA
		// PROPAGAR una excepcion es no hacer nada con ella en el metodo y dejar que sea
		// otro metodo el que la capture.
		// Si la capturamos, el metodo main no se entera de que la excepcion se ha
		// producido
		// y no puede reaccionar para volver a pedir los datos
		int resultado = 0;
		switch (op) {
		case "+":
			resultado = d1 + d2;
			break;
		case "-":
			resultado = d1 - d2;
			break;
		case "*":
			resultado = d1 * d2;
			break;
		case "/":
			resultado = d1 / d2;
			break;
		}
		return resultado;
	}
}
