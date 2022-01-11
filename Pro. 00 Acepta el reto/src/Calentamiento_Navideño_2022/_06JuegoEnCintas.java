package Calentamiento_Navideño_2022;

import java.util.Scanner;

public class _06JuegoEnCintas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			int espacioT = sc.nextInt();
			int numJuegos = sc.nextInt();
			boolean error = false;
			int caraDisco1 = 0;
			int caraDisco2 = 0;

			for (int i = 0; i < numJuegos; i++) {
				int mbJuego = sc.nextInt();
				if ((caraDisco1 + mbJuego) <= espacioT) {
					caraDisco1 += mbJuego;
				} else if ((caraDisco2 + mbJuego) <= espacioT) {
					caraDisco2 += mbJuego;
				} else {
					error = true;
				}
			}

			if (error) {
				System.out.println("NO");
			} else {
				System.out.println("SI");
			}
		} while (sc.hasNext());

	}
}
