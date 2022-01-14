package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _11SecuencialTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		int d1 = 0, d2 = 0;
		String op = "";
		do {

			do {
				try {
					System.out.println("Dato 1");
					d1 = sc.nextInt();
					ok = true;
				} catch (InputMismatchException e) {
					System.out.println("El primer dato debe ser un entero");
					sc.nextLine();
				}
			} while (!ok);

			ok = false;
			do {
				try {
					System.out.println("Dato 2");
					d2 = sc.nextInt();
					ok = true;
				} catch (InputMismatchException e) {
					System.out.println("El segundo dato debe ser un entero");
					sc.nextLine();
				}
			} while (!ok);

			ok = false;
			do {
				try {
					System.out.println("Operacion (+, -, *, /): ");
					op = sc.next();
					System.out.println("Resultado: " + calcular(d1, d2, op));
					ok = true;
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir un numero entre 0");
				}
			} while (!ok);
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
