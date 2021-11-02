package _03Ejercicios;

import java.util.Scanner;

public class _14ForImparesHastaN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce hasta que numero contar");
		int veces = sc.nextInt();
		
		for (int i = 0; i < veces; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			} else {
				
			}
		}
	}
}
