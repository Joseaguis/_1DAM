package _03Ejercicios;

import java.util.Scanner;

public class _06Containers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pesoT = 0;
		int sPesoT = 0;
		
		do {
			System.out.println("Introduce el peso del container");
			int conteiner = sc.nextInt();
			sPesoT += conteiner;
			if (sPesoT <= 700) {
				pesoT = sPesoT;
			}
			System.out.println("Peso actual: " + pesoT);
		} while (sPesoT < 700);
		System.out.println("El total de peso es: " + pesoT);
	}
}
