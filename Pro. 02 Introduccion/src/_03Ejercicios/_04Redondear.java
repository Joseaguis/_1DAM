package _03Ejercicios;

import java.util.Scanner;

public class _04Redondear {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		double num = sc.nextDouble();
		
		num = Math.round(num * 10);
		
		System.out.println(num / 10);
		
	}
}
