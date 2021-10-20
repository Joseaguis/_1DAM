package _03Ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int veces = sc.nextInt();
		int suma = 0;
		while (veces > 0) {
			suma = suma + veces;
			veces--;
		}
		System.out.println("La suma total es de: " + suma);
	}
}
