package Calentamiento_Navideño_2021;

import java.util.Scanner;

public class _01LeyendoElDiccionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuarPrograma = false;
		do {
			int duracionPalabra = sc.nextInt();
			if (duracionPalabra != 0) {
				boolean continuar = false;
				int sumaPalabras = 0;
				do {
					int numPalabras = sc.nextInt();
					if (numPalabras != 0) {
						sumaPalabras += numPalabras;
					} else {
						continuar = true;
					}
				} while (!continuar);

				int segundos = sumaPalabras * duracionPalabra;
				int hora = segundos / 3600;
				segundos = segundos % 3600;
				int minutos = segundos / 60;
				segundos = segundos % 60;
				System.out.format("%02d:%02d:%02d", hora, minutos, segundos);

			} else {
				continuarPrograma = true;
			}
		} while (!continuarPrograma);
		sc.close();
	}
}
