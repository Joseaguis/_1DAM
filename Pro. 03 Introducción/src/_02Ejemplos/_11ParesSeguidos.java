package _02Ejemplos;

import java.util.Scanner;

public class _11ParesSeguidos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Juego: Cuantos pares consigues introducir sin fallar");

		int numero = 0, pares = 0;

		do {
			System.out.println("introduce un número: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				pares++;
			}

		} while (numero % 2 == 0);
		

		pares = 0;
		numero = 0;

		System.out.println("Introduce un número");
		numero = sc.nextInt();
		while (numero % 2 == 0) {
			System.out.println("introduce un número: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				pares++;

			}
		}

	}
}
