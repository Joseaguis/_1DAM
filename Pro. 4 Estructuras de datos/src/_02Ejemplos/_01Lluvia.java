package _02Ejemplos;

import java.util.Scanner;

public class _01Lluvia {
	final static int DIAS = 3;
	public static void main(String[] args) {
		// Lluvia de enero. Leer cuanto ha llovido cada dia
		// y mostrar la media de lluvias
		
		Scanner sc = new Scanner(System.in);
		
		double suma = 0;
		for (int dia = 1; dia <= DIAS; dia++) {
			System.out.println("Lluvia del " + dia + ":");
			double lluvia = sc.nextDouble();
			suma += lluvia;
		}
		
		System.out.println("Media: " + (suma / DIAS));
	}
}
