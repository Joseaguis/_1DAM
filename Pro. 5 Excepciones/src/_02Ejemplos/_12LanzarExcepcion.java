package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _12LanzarExcepcion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes = 0;
		boolean ok = false;
		do {
			try {
				System.out.println("Numero de mes: ");
				mes = sc.nextInt();
				System.out.println("Dias del mes: " + diasDelMes(mes));
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce en numero entero");
				sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("Introduce un numero entre 1 y 12");
				sc.nextLine();
			}
		} while (!ok);

	}

	public static int diasDelMes(int mes) {
		int dias = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			throw new IllegalArgumentException("Mes " + mes + " incorreto - [1-12]");
		}

		return dias;
	}
}
