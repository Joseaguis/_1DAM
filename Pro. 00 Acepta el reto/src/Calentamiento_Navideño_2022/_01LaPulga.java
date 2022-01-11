package Calentamiento_Navideño_2022;

import java.util.Scanner;

public class _01LaPulga {
	final static int minimo = 1;
	final static int max_1 = 100;
	final static int max_2 = 100_000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, f = 0, t = 0;

		int contador = sc.nextInt();
		boolean continuar = false;

		for (int i = 0; i < contador; i++) {
			n = sc.nextInt() + 1;
			f = sc.nextInt();
			t = sc.nextInt();
			
			int salto = t % n;
			salto = salto * f;
			System.out.println(salto);
		}

	}
}
