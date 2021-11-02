package _03Ejercicios;

import java.util.Scanner;

public class _15ForNImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de impares");
		int veces = sc.nextInt();
		int numI = 0;
		
		for (int i = 0; i < veces; i++) {
			
			if (numI % 2 == 1) {
				System.out.println(numI);
			}else {
				
			}
			
		}
		
	}
	
}
