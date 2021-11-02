package _03Ejercicios;

import java.util.Scanner;

public class _17ForSumaNPrimeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int suma = 0;
		for (int i = 0; i <= num; i++) {
			suma += i;
		}
		System.out.println("la suma es: " + suma);
	}
}
