package _03Ejercicios;

import java.util.Scanner;

public class _21Comercio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("¿Cuanto has pagado?");
		double precio = tec.nextDouble();
		int tipodescuento;
		double descuento;

		if (precio <= 40) {
			tipodescuento = 0;
			descuento = 0;

		} else {
			tipodescuento = 8;
			descuento = precio * 0.08;

		}
		if (descuento > 12) {
			descuento = 12;
		} else
			System.out.println("Porcentaje de descuento aplicado: " + tipodescuento + "%");
		System.out.println("Descuento aplicado: " + descuento + "€");
		System.out.println("Cantidad a pagar: " + (precio - descuento) + "€");

	}
}
