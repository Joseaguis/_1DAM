package _03Ejercicios;

import java.util.Scanner;

public class _07Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0, nNotas = 0, nAprobados = 0, nSuma = 0;
		
		do {
			
			System.out.println("Introduce una nota");
			nota = sc.nextInt();
			if (nota <= 10) {
				nNotas++;
				if (nota >= 5) {
					nAprobados++;
				}
				nSuma += nota;
			}else{
				System.out.println("numero entre 0 y 10");
			}
			
		} while (nota >= 0);
		
		System.out.println("Nº de notas: " + nNotas);
		System.out.println("Nº de Aprobados: " + nAprobados);
		double nMedia = (double)nSuma / nNotas;
		System.out.format("Nota media: %04.2f", nMedia);
	}
}
