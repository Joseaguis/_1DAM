package _03Ejercicios;

import java.util.Scanner;

import org.w3c.dom.DOMConfiguration;

public class _13Taxi {

	public static void main(String[] args) {

		final double LABDIA = 0.73;
		final double LABNOCHE = 0.84;
		final double DOMINGOS = 0.93;
		final double minDia = 2.95;
		final double minNoche = 4;
		double precio = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el momento del dia, el dia de la semana y los kilometros");
		String momento = sc.next();
		int dia = sc.nextInt();
		double quilomentros = sc.nextDouble();

		if (dia == 7) {
			precio = quilomentros * DOMINGOS;
		} else {
			if (momento.equalsIgnoreCase("DIA")) {
				precio = quilomentros * LABDIA;
			} else {
				precio = quilomentros * LABNOCHE;
			}
		}

		if (momento.equalsIgnoreCase("DIA")) {
			if (precio < minDia) {
				precio = minDia;
			} else {

			}
		} else if (momento.equalsIgnoreCase("NOCHE")) {
			if (precio < minNoche) {
				precio = minNoche;
			} else {

			}
		} else {
			System.out.println("El momento esta mal escrito");
		}
		System.out.format("El precio es %1.2f€%n", precio);
	}
}
