package _04ModeloExamen;

import java.util.Scanner;

public class _02Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce peso del recipiente 1: ");
		int recipiente1 = sc.nextInt();
		
		System.out.println("Introduce peso del recipiente 2: ");
		int recipiente2 = sc.nextInt();
		int cuchara = 0;
		
		int cont = 0;
		while (recipiente1 - recipiente2 > 50 || recipiente2 - recipiente1 > 50) {
			if (recipiente1 > recipiente2) {
				recipiente1 -= 20;
				recipiente2 += 20;
			}else {
				recipiente1 += 20;
				recipiente2 -= 20;
			}
			cont++;
			System.out.println("Recipiente 1: " + recipiente1 + " -  Recipiente 2: " + recipiente2);
		}
		System.out.println("IGUALADOS. Cucharas movidas: " + cont);
		
		
	}
}
