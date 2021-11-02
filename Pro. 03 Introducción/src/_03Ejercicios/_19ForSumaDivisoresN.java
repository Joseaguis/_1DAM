package _03Ejercicios;

import java.util.Scanner;

public class _19ForSumaDivisoresN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		
		int suma = 0;
		
		for (int i = 1; i < num; i++) {
			if(num % i == 0) suma += i;
			else;
		}
		System.out.println("La suma de los divisores da: " + suma);
	}
}
