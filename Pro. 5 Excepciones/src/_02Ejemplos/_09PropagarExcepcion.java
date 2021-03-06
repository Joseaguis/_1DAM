package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _09PropagarExcepcion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		do {
			try {
				System.out.println("Dato 1");
				int d1 = sc.nextInt();

				System.out.println("Dato 2");
				int d2 = sc.nextInt();

				System.out.println("Operacion (+, -, *, /): ");
				String op = sc.next();

				System.out.println("Resultado: " + calcular(d1, d2, op));
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un entero");
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir entre 0");
			} finally {
				sc.nextLine();
			}
		} while (!ok);
	}

	public static int calcular(int d1, int d2, String op) {
		// En este metodo lo convieniente No es capturar la excepcion, SINO PROPAGARLA
		// PROPAGAR una excepcion es no hacer nada con ella en el metodo y dejar que sea
		// otro metodo el que la capture.
		// Si la capturamos, el metodo main no se entera de que la excepcion se ha producido
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
