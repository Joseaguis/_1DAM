package _02Ejemplos;

import java.util.Scanner;

public class _07Regimen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pensión-Completa, Alojamiento-Desayuno, Solo-Alojamiento
		System.out.println("Indica regimen de alojamiento (PC, MP, AD, SA): ");
		String regimen = sc.nextLine();

		System.out.println("El precio incluye: ");
		switch (regimen) {
		case "PC":
			System.out.print("Cena, ");
		case "MP":
			System.out.print("Comida, ");
		case "AD":
			System.out.print("Desayuno y ");
		case "SA":
			System.out.print("Limpieza de la habitación");
			break;
		default:
			System.out.println("Dato mal introducido");
		}

	}
}
