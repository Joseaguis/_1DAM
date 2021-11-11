package _02Ejemplos;

import java.util.Scanner;

public class _03Lluvia {
	final static int DIAS = 3;
	public static void main(String[] args) {
		// Lluvia de enero. Leer cuanto ha llovido cada dia
		// y mostrar la media de lluvias
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos un array de DIAS elementos en el que guardar todas
		//Las lluvias
		
		double[] lluvia = new double [DIAS];
		
		double suma = 0;
		for (int dia = 0; dia < DIAS; dia++) {
			System.out.println("Lluvia del " + (dia + 1) + ":");
			lluvia[dia] = sc.nextDouble();
			suma += lluvia[dia];
		}
		
		double media = (suma / DIAS);
		int diasLl = 0;
		for (int i = 0; i < lluvia.length; i++) {
			if(lluvia[i] > media) diasLl++;
		}
		
		System.out.println("Media: " + media);
		System.out.println("Llovieron " + diasLl + " dias mas que la media");
		
	}
}
