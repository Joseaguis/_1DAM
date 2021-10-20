package _03Ejercicios;

import java.util.Scanner;

public class _18Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la hora en notación 24");
		int horas = tec.nextInt();
		System.out.println("Introduce los minutos");
		int mins = tec.nextInt();

		if (horas <= 12) {
			System.out.println("Son las " + horas + ":" + mins);
		} else {
			horas = horas - 12;
			System.out.println("Son las " + horas + ":" + mins + " p.m");
		}
	}

}
