package _03Ejercicios;

import java.util.Scanner;

public class _22NumeroDeCifras {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
		int num = sc.nextInt();
		int longitud = 0;
		
		while (num > 0) {
			num = num / 10;
			longitud++;
		}
		System.out.println("Tiene una longitud de " + longitud);
	}
}
