package Calentamiento_Navideño;

import java.util.Scanner;

public class _02CucharadasSopa {

	static final int MIN_CUCHARADAS = 0;
	static final int MAX_CUCHARADAS = 1_000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = sc.nextInt();

		int a = 0, b = 0, n = 0;

		for (int i = 0; i < contador; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			int numPosiblesCucharadas = 0;
			for (int j = a; j < n; j++) {
				
				
				
			}
			System.out.println(numPosiblesCucharadas);
		}

	}
}
