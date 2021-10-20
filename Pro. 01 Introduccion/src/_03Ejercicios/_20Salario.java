package _03Ejercicios;

import java.util.Scanner;

public class _20Salario {
	public static void main(String[] args) {
		final int JORNADA = 40;

		Scanner tec = new Scanner(System.in);
		System.out.println("¿Cuantas horas has trabajado?");
		double horas = tec.nextDouble();
		double horasext = 0;
		if (horas > JORNADA) {
			horasext = horas - JORNADA;
		}
		double paga = (horas * 6) + (horasext * 10);
		double neto = 0;
		if (paga <= 350) {
			neto = paga - (paga * 0.02);
		} else {
			neto = paga - (paga * 0.1);
		}
		System.out.println("Tu paga en neto es de " + neto + " euros");

	}
}