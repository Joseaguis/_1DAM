package _03Ejercicios;

import java.util.Scanner;

public class _11LongitudEntero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un entero largo: ");
		long num = sc.nextLong();
		
		String numS = String.valueOf(num);
		
		System.out.println("Longitud: " + numS.length());
		
	}
}
