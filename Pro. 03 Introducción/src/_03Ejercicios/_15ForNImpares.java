package _03Ejercicios;

import java.util.Scanner;

public class _15ForNImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de impares");
		int n = sc.nextInt();
		int impar = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.println(impar);
			impar += 2;
		}
		
	}
	
}
