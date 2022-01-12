package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01ValidarFecha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(esFechavalida("10/1/2000"));
		System.out.println(esFechavalida("10/14/2000"));
		System.out.println(esFechavalida("10 1 2000"));
		System.out.println(esFechavalida("10/ene/2000"));
		System.out.println(esFechavalida("10-1-2000"));
	}

	public static boolean esFechavalida(String fecha) {
		int d, m, a;
		boolean fechaCorrecta = false;
		try {
			d = Integer.parseInt(fecha.substring(0, fecha.indexOf('/')));
			m = Integer.parseInt(fecha.substring(fecha.indexOf('/') + 1, fecha.lastIndexOf('/')));
			a = Integer.parseInt(fecha.substring(fecha.lastIndexOf('/') + 1));
			if (d > 0 && d <= 31) {
				if (m > 0 && m <= 12) {
					if (a > 0) {
						fechaCorrecta = true;
					}
				}
			}

		} catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (InputMismatchException e) {
			// TODO: handle exception
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		return fechaCorrecta;
	}
}
