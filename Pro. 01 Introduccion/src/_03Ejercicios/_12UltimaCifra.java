package _03Ejercicios;

import java.util.Scanner;

public class _12UltimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num = tec.nextInt();
		num = num % 10;
		System.out.println("La última cifra es " + num);
	}

}
